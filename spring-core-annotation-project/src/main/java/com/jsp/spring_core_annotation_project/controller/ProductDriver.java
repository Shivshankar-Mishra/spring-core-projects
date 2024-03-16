package com.jsp.spring_core_annotation_project.controller;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jsp.spring_core_annotation_project.dto.Product;

public class ProductDriver {
public static void main(String[] args) {
	AnnotationConfigApplicationContext ap = new AnnotationConfigApplicationContext(Product.class);
	Product product = (Product)ap.getBean("myProduct");
	System.out.println(product);
}
}
