package com.jsp.springcore_simple_project.constructor_injection;

public class Certi {
	private String name;

	/**
	 * @param name
	 */
	public Certi(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Certi [name=" + name + "]";
	}
	

}
