package com.jsp.springcore_simple_project.autowire_xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowireDriver {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/jsp/springcore_simple_project/autowire_xml/autowire_config.xml");
		Emp emp1 = applicationContext.getBean("emp1", Emp.class);
		System.out.println(emp1);
	}

}
