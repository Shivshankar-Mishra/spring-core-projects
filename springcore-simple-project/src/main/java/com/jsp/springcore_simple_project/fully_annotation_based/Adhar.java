package com.jsp.springcore_simple_project.fully_annotation_based;

import org.springframework.beans.factory.annotation.Value;

public class Adhar {
	@Value("99983837")
	private long adhar;

	/**
	 * @return the adhar
	 */
	public long getAdhar() {
		return adhar;
	}

	/**
	 * @param adhar the adhar to set
	 */
	public void setAdhar(long adhar) {
		this.adhar = adhar;
	}

	@Override
	public String toString() {
		return "Adhar [adhar=" + adhar + "]";
	}
	

}
