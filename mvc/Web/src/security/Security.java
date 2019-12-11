package security;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Security {
	
	JdbcTemplate temp;
	
	public Security()
	{
		ApplicationContext context= new ClassPathXmlApplicationContext("spring-config.xml");
		System.out.println("ok");
		temp=(JdbcTemplate)context.getBean("jtemp");
	}
	
                public boolean isUserValid(String username,String userpassword)
                {
                	List list = temp.queryForList("select * from logintable where loginid=? and loginpassword=?", new Object[] {username,userpassword});
                	
                	if(list.size()==1)
                	{
                		return true;
                		
                	}
                	else
                		return false;
                
           
                }
                
}
