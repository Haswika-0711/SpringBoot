package com.training.org;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyMain {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		EmployeeManager eman=(EmployeeManager)context.getBean("empMan");
		eman.getEmployeeDetails();
	}

}
