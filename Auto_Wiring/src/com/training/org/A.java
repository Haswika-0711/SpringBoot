package com.training.org;

public class A {
	
	private B b;
	
	public A() {
	
		System.out.println("A  constructor is called");
	}

	public B getB() {
		return b;
	}

	public void setB(B b) {
		this.b = b;
	}
	
	
	public void print() {
		System.out.println("print from A class");
	}
	
	public void display() {
		System.out.println("display is called");
		b.show();
		print();
	}
	
}


