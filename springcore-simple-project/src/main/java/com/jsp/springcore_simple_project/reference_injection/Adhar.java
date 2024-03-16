package com.jsp.springcore_simple_project.reference_injection;

public class Adhar {
	private long adharNo;

	
	/**
	 * 
	 */
	public Adhar() {
	}


	/**
	 * @param adharNo
	 */
	public Adhar(long adharNo) {
		this.adharNo = adharNo;
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
