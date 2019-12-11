package aop;

import java.lang.reflect.Method;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;


public class MyAround implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation obj) throws Throwable {
		
		if(obj.getMethod().getName().equals("displayEmployee"))
		{
			System.out.println("-------------------------------------before logic got executed---part of around");
			obj.proceed();
			System.out.println("-------------------------------------after logic got executed---part of around");
		}
		return obj;
	}

	

}
