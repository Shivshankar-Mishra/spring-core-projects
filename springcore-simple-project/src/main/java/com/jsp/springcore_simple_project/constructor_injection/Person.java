package com.jsp.springcore_simple_project.constructor_injection;

public class Person {
	private int a;
	private int b;
	private Certi certi;
	
	/**
	 * @param a
	 * @param b
	 * @param certi
	 */
	public Person(int a, int b, Certi certi) {
		super();
		this.a = a;
		this.b = b;
		this.certi = certi;
		System.out.println("int int constructor");
	}
	public Person(double a, double b, Certi certi) {
		super();
		this.a = (int)a;
		this.b = (int)b;
		this.certi = certi;
		System.out.println("double double constructor");
	}
	public Person(String a, String b, Certi certi) {
		super();
		this.a = Integer.parseInt(a);
		this.b = Integer.parseInt(b);
		this.certi = certi;
		System.out.println("String String constructor");
	}
	

	@Override
	public String toString() {
		return "Person [a=" + a + ", b=" + b + ", certi=" + certi + "]";
	}

	
	
	

}
