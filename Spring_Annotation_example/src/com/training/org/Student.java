package com.training.org;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
	private Qualification qualification;

	public Student() {
		System.out.println("Default constructor of Student is called");
	}
	
	public Student(Qualification qualification) {
		super();
		this.qualification = qualification;
	}

	public Qualification getQualification() {
		return qualification;
	}

	@Autowired
	public void setQualification(Qualification qualification) {
		this.qualification = qualification;
	}

	@Override
	public String toString() {
		return "Student [qualification=" + qualification + "]";
	}

	
}
