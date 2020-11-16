package com.training.org;

import java.util.List;

import javax.sql.DataSource;

public interface StudentDAO {

    public void setDataSource(DataSource ds);
    public void create(Integer id,String name,Integer age);
	List<Student> listStudents();
	public void update(Integer id,Integer age);

    
}

