package com.training.org;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyMain {
	 public static void main(String[] args) throws Exception 
	    {
	        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	 
	        EmployeeController controller = context.getBean(EmployeeController.class);
	         
	        controller.createNewEmployee();
	    }
}
