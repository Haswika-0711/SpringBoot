package com.training.org;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Logging {

	@Pointcut("execution(* com.training.org.Employee.getSalary(..))")
	private void selectedGetSalary() {
		System.out.println("selectedGetSalary is called");
	}
	
	@Before("selectedGetSalary()")
	public void beforeAdvice() {
		System.out.println("Before advice is called");
	}
	
}
