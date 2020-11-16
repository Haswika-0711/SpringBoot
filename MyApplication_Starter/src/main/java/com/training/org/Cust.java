package com.training.org;

public class Cust {
	private long id;
	private String content;

	public Cust() {

	}

	public Cust(long id, String content) {
		super();
		this.id = id;
		this.content = content;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "Cust [id=" + id + ", content=" + content + "]";
	}

	




}

