package com.training.org;

public class Qualification {
	private String stream;
	private String year;
	private double percentage;
	
	public Qualification() {
		System.out.println("Default constructor of Qualification is called");
	}
	public Qualification(String stream, String year, double percentage) {
		super();
		this.stream = stream;
		this.year = year;
		this.percentage = percentage;
	}
	
	public String getStream() {
		return stream;
	}
	public void setStream(String stream) {
		this.stream = stream;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	@Override
	public String toString() {
		return "Qualification [stream=" + stream + ", year=" + year + ", percentage=" + percentage + "]";
	}
	
	
	
	
	

}