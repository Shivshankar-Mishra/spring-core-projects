package com.jsp.springcore_simple_project.autowire_xml;

public class Adhar {
	private long adharNo;

	/**
	 * @param adharNo
	 */
	
	public Adhar(long adharNo) {
		super();
		this.adharNo = adharNo;
	}

	/**
	 * 
	 */
	public Adhar() {
		super();
	}

	/**
	 * @return the adharNo
	 */
	public long getAdharNo() {
		return adharNo;
	}

	/**
	 * @param adharNo the adharNo to set
	 */
	public void setAdharNo(long adharNo) {
		this.adharNo = adharNo;
	}

	@Override
	public String toString() {
		return "Adhar [adharNo=" + adharNo + "]";
	}
	
	

}
