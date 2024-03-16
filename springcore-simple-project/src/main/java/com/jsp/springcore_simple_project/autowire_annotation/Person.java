package com.jsp.springcore_simple_project.autowire_annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Person {
	
	private Address address;

	/**
	 * @param address
	 */
	
	public Person(Address address) {
		System.out.println("By constructor");
		this.address = address;
	}

	/**
	 * 
	 */
	public Person() {
		super();
	}

	/**
	 * @return the address
	 */
	public Address getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	@Autowired
	public void setAddress(Address address) {
		System.out.println("By setter method");
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [address=" + address + "]";
	}
	

}
