package pkg;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {
	public void fun()
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");	
		
		//Employee employee1 = (Employee)context.getBean("myproxy");
		
		//employee1.setEname("Mahesh");
		//employee1.setEsalary(1000);
		//employee1.displayEmployee();

		
	}
	public static void main(String s[])
	{
		MyApp obj = new MyApp();
		obj.fun();
	}
}
