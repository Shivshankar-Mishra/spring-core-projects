package com.jsp.spring_core_xml_project.xml.variable;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component(value="MyId")
public class A {
	@Value(value="123")
	int a;
	@Value(value="234")
	int b;
	public void add(int a, int b) {
		System.out.println("Addition is: " +(a+b));
	}

}
