package com.jsp.springcore_simple_project.reference_injection;

public class Person {
	private String name;
	private Adhar adhar;
	/**
	 * 
	 */
	public Person() {
		super();
	}
	/**
	 * @param name
	 * @param adhar
	 */
	public Person(String name, Adhar adhar) {
		super();
		this.name = name;
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
	/**
	 * @return the adhar
	 */
	public Adhar getAdhar() {
		return adhar;
	}
	/**
	 * @param adhar the adhar to set
	 */
	public void setAdhar(Adhar adhar) {
		this.adhar = adhar;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", adhar=" + adhar + "]";
	}
	

}
