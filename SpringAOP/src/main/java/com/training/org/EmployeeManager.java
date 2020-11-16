package com.training.org;

import org.springframework.stereotype.Component;

@Component
public class EmployeeManager {
	public String getEmployeeDetails() {
		System.out.println("getEmployeeDetails is called");
		return "EMP DETAILS";
	}
}
