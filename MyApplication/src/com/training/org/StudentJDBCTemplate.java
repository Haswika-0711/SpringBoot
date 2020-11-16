package com.training.org;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class StudentJDBCTemplate implements StudentDAO{
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplateObject;
    
    public void setDataSource(DataSource dataSource) {
        this.dataSource=dataSource;
        this.jdbcTemplateObject=new JdbcTemplate(dataSource);
    }

    @Override
    public void create(Integer id, String name, Integer age) {
        String query="insert into Student(name,age) values (?,?)";
        jdbcTemplateObject.update(query,name,age);
        System.out.println("Record inserted into student table ");
    }


	
	@Override
	public List<Student> listStudents() {
		// TODO Auto-generated method stub
		String SQL="select * from student";
        List<Student> student=jdbcTemplateObject.query(SQL, new StudentMapper());
        return student;
	}
	@Override
	public void update(Integer id, Integer age) {
		// TODO Auto-generated method stub
		String SQL="update student set age=? where id=?";
        jdbcTemplateObject.update(SQL, age,id);
        System.out.println("updated with id "+id);
	}

     
    
    
}