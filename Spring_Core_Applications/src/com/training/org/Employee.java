package com.training.org;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employee {
	private int empId;
	private String name;
	private double salary;
	private Address address;
	private List<String> technologies;
	private List<Project> listOfProjects;
	
	public Employee() {
		System.out.println("Default constructor is called");
		empId=0;
		name="";
		salary=0;
		address=new Address();
		technologies=new ArrayList<String>();
		listOfProjects=new ArrayList<Project>();
	}
	public Employee(int empId, String name, double salary,Address add,ArrayList<String> tech,ArrayList<Project> proj) {
		super();
		System.out.println("Parameterised constructor is called");
		this.empId = empId;
		this.name = name;
		this.salary = salary;
		this.address=add;
		technologies=tech;
		listOfProjects=proj;
	}
	
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		System.out.println("setEmpId is called");
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println("setName is called");
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		System.out.println("setSalary is called");
		this.salary = salary;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		System.out.println("setAddress is called");
		this.address = address;
	}

	public List<String> getTechnologies() {
		return technologies;
	}
	
	
	public void setTechnologies(List<String> tech) {
		System.out.println("setTechnologies is called");
		this.technologies = tech;
	}
	
	public List<Project> getListOfProjects() {
		return listOfProjects;
	}
	
	public void setListOfProjects(List<Project> listOfProjects) {
		System.out.println("setListOfProjects is called");
		this.listOfProjects = listOfProjects;
	}
	@Override
	public String toString() {
		String str1="";
		String str2="";
		Iterator<String> iter1=technologies.iterator();
		while(iter1.hasNext()) {
			str1+=iter1.next();
		}
		
		Iterator<Project> iter2=listOfProjects.iterator();
		while(iter2.hasNext()) {
			str2+=iter2.next().toString();
		}
		
		return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary + ", address=" + address + "]   Technologies:- "+str1+" List of Projects"+str2;
	}
	
	
	
}