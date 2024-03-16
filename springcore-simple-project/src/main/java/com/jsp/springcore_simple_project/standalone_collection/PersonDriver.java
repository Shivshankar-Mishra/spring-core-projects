package com.jsp.springcore_simple_project.standalone_collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonDriver {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/jsp/springcore_simple_project/standalone_collection/standalone_config.xml");
		Person p1 = context.getBean("person1", Person.class);
		System.out.println(p1);
	}

}
