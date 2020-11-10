package com.training.org;

import org.springframework.context.ApplicationEvent;

public class EmployeeEvent extends ApplicationEvent {

    private String eventType;
    private EmployeeDTO employee;
    public EmployeeEvent(Object source,String eventType,EmployeeDTO employee) {
        super(source);
        this.eventType=eventType;
        this.employee=employee;
        
    }
    
    
    public String getEventType() {
        return eventType;
    }
    
    public EmployeeDTO getEmployee() {
        return employee;
    }
}



