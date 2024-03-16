package com.jsp.springcore_simple_project.autowire_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowireDriver {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/jsp/springcore_simple_project/autowire_annotation/autowire_config.xml");
		Person p1 = applicationContext.getBean("person",Person.class);
		System.out.println(p1);
	}

}
