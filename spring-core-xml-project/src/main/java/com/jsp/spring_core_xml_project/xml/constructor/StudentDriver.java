package com.jsp.spring_core_xml_project.xml.constructor;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentDriver {
	public static void main(String[] args) {
		BeanFactory beanFactory = new ClassPathXmlApplicationContext("myconstructor.xml");
		Student student = (Student)beanFactory.getBean("Constructor");
		System.out.println("id: "+ student.getId());
		System.out.println("name: "+ student.getName());
		System.out.println("email: "+ student.getEmail());
	}

}
