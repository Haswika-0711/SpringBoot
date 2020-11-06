package com.training.org;

public class Employee extends Person{
	
	private Integer empId;

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String toString() {
		System.out.println(super.toString());
		return "Employee [empId=" + empId + "]";
	}
	

}