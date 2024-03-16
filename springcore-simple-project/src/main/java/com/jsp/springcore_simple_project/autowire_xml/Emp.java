package com.jsp.springcore_simple_project.autowire_xml;

public class Emp {
	private Adhar adhar;

	/**
	 * @param adhar
	 */
	
	public Emp(Adhar adhar) {
		super();
		this.adhar = adhar;
	}

	/**
	 * 
	 */
	public Emp() {
		super();
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
		return "Emp [adhar=" + adhar + "]";
	}

	
	

}
