package com.jsp.springcore_simple_project.reference_injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RefDriver {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("/com/jsp/springcore_simple_project/reference_injection/refconfig.xml");
		Person person = (Person)applicationContext.getBean("personRef");
		System.out.println(person);
	}

}
