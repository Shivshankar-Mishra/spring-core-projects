package com.jsp.springcore_simple_project.stereotype_annotation;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Emp {
	@Value("Ram")
	private String name;
	@Value("ram@mail.com")
	private String email;
	@Value("#{listVal}")
	private List<String> fruits;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
	/**
	 * @return the fruits
	 */
	public List<String> getFruits() {
		return fruits;
	}
	/**
	 * @param fruits the fruits to set
	 */
	public void setFruits(List<String> fruits) {
		this.fruits = fruits;
	}
	@Override
	public String toString() {
		return "Emp [name=" + name + ", email=" + email + ", fruits=" + fruits + "]";
	}
	
	

}
