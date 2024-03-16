package com.jsp.springcore_simple_project.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonDriver {
	public static void main(String[] args) {
		
	
	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/jsp/springcore_simple_project/spel/spel_config.xml");
	Person p = applicationContext.getBean("person", Person.class);
	System.out.println(p);
	}
}
