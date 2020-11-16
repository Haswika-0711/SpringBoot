package com.training.org;


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

	@RequestMapping("/cust")
	public Cust cust(@RequestParam(value="name",defaultValue = "roja") String name) {
		return new Cust(1,name);
	}

	@RequestMapping("/getallcustomer")
	public List<Customer> getEmpList(){
		List<Customer> eList=new ArrayList<Customer>();

		eList.add(new Customer(101,"Eshan"));
		eList.add(new Customer(102,"Tanish"));
		

		return eList;


	}

}




