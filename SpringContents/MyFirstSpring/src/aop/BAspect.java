package aop;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class BAspect implements MethodBeforeAdvice
{
	@Override
	public void before(Method method, Object[] arg1, Object arg2) throws Throwable {
		
		if(method.getName().equals("displayEmployee"))
		{
			System.out.println("------------------------------------------before method got executed.");
		}
	}  
}