package com.jsp.springcore_simple_project.stereotype_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpDriver {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/jsp/springcore_simple_project/stereotype_annotation/stereotype_config.xml");
		Emp emp = context.getBean("emp", Emp.class);
		Emp emp1 = context.getBean("emp", Emp.class);
		Teacher t1 = context.getBean("teacher", Teacher.class);
		Teacher t2 = context.getBean("teacher", Teacher.class);
		System.out.println(emp);
		System.out.println(emp.hashCode());
		System.out.println(emp1.hashCode());
		System.out.println(t1);
		System.out.println(t1.hashCode());
		System.out.println(t2.hashCode());
	}

}
