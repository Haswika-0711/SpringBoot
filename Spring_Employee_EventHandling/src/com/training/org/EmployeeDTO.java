package com.training.org;

public class EmployeeDTO {
    private Integer id;
    private String fistName;
    private String lastName;
    private String designation;
    
    public EmployeeDTO() {
        System.out.println("Default constructor of EmployeeDTO is called");
        this.id = 0;
        this.fistName = "";
        this.lastName = "";
        this.designation = "";
    }
    
    public EmployeeDTO(Integer id, String fistName, String lastName, String designation) {
        System.out.println("Parameterised constructor of EmployeeDTO is called");
        this.id = id;
        this.fistName = fistName;
        this.lastName = lastName;
        this.designation = designation;
    }

    
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFistName() {
        return fistName;
    }

    public void setFistName(String fistName) {
        this.fistName = fistName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    @Override
    public String toString() {
        return "EmployeeDTO [id=" + id + ", fistName=" + fistName + ", lastName=" + lastName + ", designation="
                + designation + "]";
    }
    
    

}


