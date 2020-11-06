package com.training.org;

import java.util.ArrayList;

public class MyWorld {

	public static void main(String[] args) {
	
		Employee e1=new Employee();
		System.out.println(e1.toString());
		
		Employee e2=new Employee(101,"Eshan",10000,new Address("Pune","MH","504","304"));
		System.out.println(e2.toString());
		
		ArrayList<Employee> eList=new ArrayList<Employee>();
		eList.add(new Employee(102,"Tannu",10000,new Address("Pune","MH","504","54")));
		eList.add(new Employee(103,"ANi",100000,new Address("Hyd","TS","304","334")));
		eList.add(new Employee(102,"Pappu",60000,new Address("LA","US","774","78")));
		
		for(Employee employee : eList) {
			System.out.println(employee);
		}
		SalesEmployee se=new SalesEmployee(101,"Munna",50000,new Address("Hyd","TS","34","884"),5008);
		se.calculateSalary();
		System.out.println(se.toString());
	}

}
