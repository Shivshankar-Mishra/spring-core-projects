package com.jsp.springcore_simple_project.constructor_injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonDriver {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("/com/jsp/springcore_simple_project/constructor_injection/constructor_config.xml");
		Person person = (Person)applicationContext.getBean("person1");
		System.out.println(person);
		
		
	}

}
