package com.training.org;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class EmployeeCRUDAspect {
	
	@Before("execution(* EmployeeManager.getEmployeeDetails())")
	public void logBeforeV1(Joinpoint jointPoint) {
		System.out.println("Method before actual execution");
	}

}
