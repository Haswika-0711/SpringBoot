package com.training.org;

public class Project {
	
	private String projectId;
	private String projectName;
	private String technology;
	
	
	public Project() {
		System.out.println("Default constructor of Project is called");
		projectId="";
		projectName="";
		technology="";
	}


	
	public Project(String projectId, String projectName, String technology) {
		System.out.println("Parameterised constructor of Project is called");
		this.projectId = projectId;
		this.projectName = projectName;
		this.technology = technology;
	}

	

	
	public String getProjectId() {
		return projectId;
	}



	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}



	public String getProjectName() {
		return projectName;
	}



	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}



	public String getTechnology() {
		return technology;
	}



	public void setTechnology(String technology) {
		this.technology = technology;
	}



	@Override
	public String toString() {
		return "Project [ projectId=" + projectId + "projectName=" + projectName + ", technology=" + technology +  "]";
	}
}