package com.training.org.SpringBootWebApp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WebController {
	private List<String> newNames=Arrays.asList("Tanish","has","anirudh");
	private static List<Person> perList=new ArrayList<Person>();
	
	static {
		perList.add(new Person("Veni","B"));
		perList.add(new Person("Gopi","B"));
	}
	
	@RequestMapping(value = "/index")
	public String index(Model model) {
		return "index";
	}
	
	@RequestMapping(value = "/greet")
	public String greet(Model model) {
		model.addAttribute("name","Eshan");
		model.addAttribute("names",newNames);
		return "greet";
	}
	
	@RequestMapping(value = "/signin")
	public String signin(Model model) {
		return "signin";
	}
	@RequestMapping(value = "/signup")
	public String signup(Model model) {
		return "signup";
	}

	@RequestMapping(value = "/person")
	public String personDetails(Model model) {
		model.addAttribute("person",perList);
		return "person";
	}
	
	@RequestMapping(value = "/myform", method=RequestMethod.GET)
	public String showForm(Model model) {
	 MyForm myform=new MyForm();
	 
	  model.addAttribute("myform", myform);
	  return "MyForm";
	}
	
	@RequestMapping(value = "/myform", method=RequestMethod.POST)
	public String myform(@ModelAttribute(value="myform") MyForm myform) {
	 return "register";
	}
}
