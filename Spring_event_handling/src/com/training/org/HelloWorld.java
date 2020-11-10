package com.training.org;
public class HelloWorld {
	private String message;

	public HelloWorld() {
		System.out.println("Default constuctor of HelloWorld is called");
		this.message = message;
	}
	
	
	public HelloWorld(String message) {
		System.out.println("Parameterised constuctor of HelloWorld is called");
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}


	@Override
	public String toString() {
		return "HelloWorld [message=" + message + "]";
	}
	
	
}

