
package com.training.org.SpringBootWebApp;

public class MyForm {
	private Long id;
	private String message;
	public MyForm(Long id, String message) {
		super();
		this.id = id;
		this.message = message;
	}
	public MyForm() {
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	

}