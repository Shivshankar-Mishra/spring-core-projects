package com.jsp.springcore_simple_project.stereotype_annotation;

import java.util.List;

public class Teacher {
	private List<String> fruit;

	/**
	 * @return the fruit
	 */
	public List<String> getFruit() {
		return fruit;
	}

	/**
	 * @param fruit the fruit to set
	 */
	public void setFruit(List<String> fruit) {
		this.fruit = fruit;
	}

	@Override
	public String toString() {
		return "Teacher [fruit=" + fruit + "]";
	}
	

}
