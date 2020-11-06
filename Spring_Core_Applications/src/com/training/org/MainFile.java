package com.training.org;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MainFile {
	public static void main(String args[]) {
//		Resource resource = new ClassPathResource("applicationContext.xml");
//		BeanFactory beanFactory = new XmlBeanFactory(resource);
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Employee e1 = (Employee)context.getBean("empBean");
		System.out.println(e1);
	
	}
}