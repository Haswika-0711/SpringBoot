package com.training.org;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Service;
@Service("employeeManager")
public class EmployeeManagerImpl implements EmployeeManager,ApplicationEventPublisherAware{
	
	@Autowired
    private EmployeeDAO dao;
    
    private ApplicationEventPublisher publisher;
    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
        // TODO Auto-generated method stub
        this.publisher=publisher;
        
        
    }

    @Override
    public EmployeeDTO createNewEmployee() {
        EmployeeDTO employee=dao.createNewEmployee();
        publisher.publishEvent(new EmployeeEvent(this, "ADD", employee));
        
        return employee;
    }

}
