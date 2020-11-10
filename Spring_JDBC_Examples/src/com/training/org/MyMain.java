package com.training.org;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Iterator;
import java.util.List;

public class MyMain {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        StudentJDBCTemplate studentJDBCTemplate=(StudentJDBCTemplate)context.getBean("StudentJDBCTemplate");
        System.out.println("--CREATE RECORD----");
        //studentJDBCTemplate.create(1, "Eshan", 23);
        
        studentJDBCTemplate.update(2, 10);
        
        List<Student> student=studentJDBCTemplate.listStudents();
        for (Student student2 : student) {
            System.out.print("ID :- "+student2.getId()+" ");
            System.out.print("NAME:- "+student2.getName()+" ");
            System.out.println("AGE:- "+student2.getAge());
        }
        
        
        System.out.println("\nupdated");
    }

}
