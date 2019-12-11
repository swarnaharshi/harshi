package bl;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Security {
	JdbcTemplate temp;
	public Security()
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		System.out.println("ok");
		temp = (JdbcTemplate)context.getBean("jtemp");
	}
	
	public List<TrainingRequest> getAllTrainingRequest()
	{
		List<TrainingRequest> tr = temp.query("select * from TrainingRequest",new TrainingRequestMapper());
		return tr;
	}
	
	public int deleteTrainingRequest(int request_id)
	{
		int ret = temp.update("delete from trainingrequest where request_id=?", 
				new Object[] {request_id});
		return ret;
	}
	public int editTrainingRequestSave(TrainingRequest obj)
	{
		int ret = temp.update("update trainingrequest set request_technology=?,request_date=?"
				+ "approx_participants=?,training_location=?,training_type=? where request_id=?", 
				new Object[] {});
		return ret;
	}
	public int saveNewTrainingRequest(String pm_name,String vertical,String tech,String date
									,int apppar,String location,String type)
	{
		
		int ret = temp.update("insert into TrainingREquest values(reqidgen.nextval,?,?,?,?,?,?,?)", 
				new Object[] {pm_name,tech,date,apppar,vertical,location,type});
		return ret;
	}

	public boolean isUserValid(String username, String userpassword)
	{
		
		List list=temp.queryForList("select * from logintable where loginid= ? and loginpassword= ?",
				new Object[] {username,userpassword});
		System.out.println(list.size());
		
		if(list.size()==1)
				return true;
		else
				return false;
	}

}

