package com.training.component;


import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class MyController {
	@RequestMapping("/hello")
	public String getMessage() {
		return "Spring Boot Application another ";
	}

	@RequestMapping("/greeting")
	public Greeting greeting(@RequestParam(value="name",defaultValue = "DBS") String name) {
		return new Greeting(1,name);
	}

	@RequestMapping("/emp")
	public List<Employee> getEmpList(){
		List<Employee> eList=new ArrayList<Employee>();

		eList.add(new Employee(101,"Eshan","Madake","EShan@gmail.com"));
		eList.add(new Employee(102,"Tanish","Madake","Tanish@gmail.com"));
		eList.add(new Employee(103,"Manish","Patil","Manish@gmail.com"));
		eList.add(new Employee(104,"Kunal","Mishra","Kunal@gmail.com"));
		eList.add(new Employee(105,"Anisha","reddy","anisha@gmail.com"));

		return eList;


	}

}




