
package com.training.org;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController{
	
	@RequestMapping(value="/student",method=RequestMethod.GET)
	public ModelAndView student() {
		return new ModelAndView("student","command",new Student());
	}
	
	@RequestMapping(value="/addStudent",method=RequestMethod.POST)
	
	public String addStudent(@ModelAttribute("SpringWeb") Student student,ModelMap model) {
		 ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
	     StudentJDBCTemplate studentJDBCTemplate=(StudentJDBCTemplate)context.getBean("StudentJDBCTemplate");
	     System.out.println("--ADDING RECORD----");
	        
	    studentJDBCTemplate.create(student.getId(),student.getName(),student.getAge());
		model.addAttribute("id", student.getId());
		model.addAttribute("name", student.getName());
		model.addAttribute("age", student.getAge());
		
		return "result";
		
	}
	
//	@RequestMapping(method = RequestMethod.GET,value="/hello")
//	public String printHello(@RequestParam String firstname) {
//		System.out.println("First name is"+firstname);
//		
//		return "hello";
//	}
}