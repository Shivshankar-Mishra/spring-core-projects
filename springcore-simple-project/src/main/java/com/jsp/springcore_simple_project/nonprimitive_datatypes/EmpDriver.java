package com.jsp.springcore_simple_project.nonprimitive_datatypes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpDriver {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("/com/jsp/springcore_simple_project/nonprimitive_datatypes/empconfig.xml");
		Emp emp1 = (Emp)applicationContext.getBean("emp1");
		System.out.println(emp1);
	}
	

}
