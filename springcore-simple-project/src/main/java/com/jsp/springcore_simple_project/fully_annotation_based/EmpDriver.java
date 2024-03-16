package com.jsp.springcore_simple_project.fully_annotation_based;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EmpDriver {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(JavaConfig.class);
//		Emp emp = applicationContext.getBean("getEmp",Emp.class);
//		Emp emp = applicationContext.getBean("Emp",Emp.class);
		Emp emp = applicationContext.getBean("employee",Emp.class);
		System.out.println(emp);
	}

}
