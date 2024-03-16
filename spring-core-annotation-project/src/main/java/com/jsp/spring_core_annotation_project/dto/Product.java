package com.jsp.spring_core_annotation_project.dto;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component(value="myProduct")
public class Product {
	private int id;
	private String name;
	private double price;
	
	public Product(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	@Value(value="1")
	public void setId(int id) {
		this.id = id;
	}
	@Value(value="laptop")
	public void setName(String name) {
		this.name = name;
	}
	@Value(value="23873")
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
	

}
