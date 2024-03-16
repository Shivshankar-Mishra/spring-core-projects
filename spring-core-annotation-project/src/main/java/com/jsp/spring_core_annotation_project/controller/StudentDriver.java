package com.jsp.spring_core_annotation_project.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jsp.spring_core_annotation_project.dto.Student;

public class StudentDriver {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Student.class);
		Student student = (Student)applicationContext.getBean("student");
		System.out.println(student);
	}

}
