package com.jsp.springcore_simple_project.fully_annotation_based;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.jsp.springcore_simple_project.fully_annotation_based")
public class JavaConfig {
	@Bean
	public Adhar getAdhar() {
		Adhar adhar = new Adhar();
		return adhar;
	}
	
	@Bean(name = {"Emp","employee"})
	public Emp getEmp() {
		Emp emp = new Emp(getAdhar());
		return emp;
	}
	

}
