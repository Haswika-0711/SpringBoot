package com.example.demo;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@SpringBootApplication(scanBasePackages="com.training.org")

public class MyApplicationStarterApplication{
	public static void main(String[] args) {
		SpringApplication.run(MyApplicationStarterApplication.class, args);
	}

}
