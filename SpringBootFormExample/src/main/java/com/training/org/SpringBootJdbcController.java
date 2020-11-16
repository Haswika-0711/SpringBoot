package com.training.org;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringBootJdbcController {
	@Autowired
	JdbcTemplate jdbcTemplate;
	@RequestMapping("/insert")
	public String insert() {
		System.out.println("Inserting data");
		jdbcTemplate.execute("insert into emp99 values (101,'EShan',15000,'Dev')");
		return "Data inserted ";
		
	}
}
