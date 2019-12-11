package pkg;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class EmpDAO {

	JdbcTemplate temp;
	
	public EmpDAO()
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		System.out.println("ok");
		temp = (JdbcTemplate)context.getBean("jtemp");
	}
	public void showAllEmpData()
	{
		List<EmpData> emp = temp.query("Select * from empdata",new EmployeeMapper());
		System.out.println(emp.size());
		for(EmpData e : emp)
			e.display();
	}
	public void insertEmployee()
	{
		temp.update("insert into empdata values(empidseq.nextval,'Sudhir','Pune',10000)");
	}
	public void updateEmployee(int eid,int newsalary)
	{
		temp.update("update empdata set esalary = ? where eid=?", 
				new Object[] {newsalary,eid});	
	}
	
	public void deleteEmployee(int eid)
	{
		
	}
	public void searchEmployee1(int eid)
	{
		EmpData edata = temp.queryForObject("Select * from empdata where eid=?", 
												new Object[] {eid},
												new EmployeeMapper());
		edata.display();
	}
	
	public void searchEmployee(int eid)
	{
		List<String> data = temp.queryForList("Select ename from empdata where eid=?", 
												new Object[] {eid},
												String.class);
		if(data.size()>0)
			System.out.println("Employee exist");
		else
			System.out.println("No employee for given id");
	}
	public static void main(String s[])
	{
		EmpDAO obj = new EmpDAO();
		obj.searchEmployee1(1);
		
		//obj.showAllEmpData();
		
		
		//obj.insertEmployee();
		//obj.updateEmployee(100, 80000);
		//obj.showAllEmpData();
	}
}
