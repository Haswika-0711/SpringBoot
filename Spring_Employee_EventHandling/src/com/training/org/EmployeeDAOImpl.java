package com.training.org;

import org.springframework.stereotype.Repository;

@Repository("employeeDAO")
public class EmployeeDAOImpl implements EmployeeDAO{

    @Override
    public EmployeeDTO createNewEmployee() {
        EmployeeDTO e=new EmployeeDTO();
        e.setId(101);
        e.setFistName("Eshan");
        e.setLastName("Madake");
        e.setDesignation("Manager");
        
        return e;
    }
    
    
    public void initBean() {
        System.out.println("Init bean for : EmployeeDAOImpl");
    }
    
    public void distroyBean() {
        System.out.println("Destroy bean for : EmployeeDAOImpl");
    }
    

    
}
