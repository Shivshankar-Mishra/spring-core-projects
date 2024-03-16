package com.jsp.springcore_simple_project.fully_annotation_based;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component("emp")
public class Emp {
	@Value("Shiv")
	private String name;
	private Adhar adhar;
	

	/**
	 * @param adhar
	 */
	public Emp(Adhar adhar) {
		super();
		this.adhar = adhar;
	}

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

	@Override
	public String toString() {
		return "Emp [name=" + name + ", adhar=" + adhar + "]";
	}

	
	

}
