package com.jsp.springcore_simple_project.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person {
	@Value("Shiv")
	private String name;
	@Value("shiv@mail.com")
	private String email;
	@Value("#{T(java.lang.Math).sqrt(25)} ")
	private double sqroot;
	@Value("#{ T(java.lang.Math).PI} ")
	private double pie;
	@Value("#{T(java.lang.Math).E}")
	private double e;
	@Value("#{new java.lang.String('This is an object')}")
	private String obj;
	@Value("#{28>20? 'Ram':'Krishna'}")
	private String ans;
	@Value("#{ 100>0}")
	private boolean state;
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
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
	/**
	 * @return the sqroot
	 */
	public double getSqroot() {
		return sqroot;
	}
	/**
	 * @param sqroot the sqroot to set
	 */
	public void setSqroot(double sqroot) {
		this.sqroot = sqroot;
	}
	/**
	 * @return the pie
	 */
	public double getPie() {
		return pie;
	}
	/**
	 * @param pie the pie to set
	 */
	public void setPie(double pie) {
		this.pie = pie;
	}
	/**
	 * @return the e
	 */
	public double getE() {
		return e;
	}
	/**
	 * @param e the e to set
	 */
	public void setE(double e) {
		this.e = e;
	}
	/**
	 * @return the obj
	 */
	public String getObj() {
		return obj;
	}
	/**
	 * @param obj the obj to set
	 */
	public void setObj(String obj) {
		this.obj = obj;
	}
	/**
	 * @return the ans
	 */
	public String getAns() {
		return ans;
	}
	/**
	 * @param ans the ans to set
	 */
	public void setAns(String ans) {
		this.ans = ans;
	}
	/**
	 * @return the state
	 */
	public boolean isState() {
		return state;
	}
	/**
	 * @param state the state to set
	 */
	public void setState(boolean state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", email=" + email + ", sqroot=" + sqroot + ", pie=" + pie + ", e=" + e
				+ ", obj=" + obj + ", ans=" + ans + ", state=" + state + "]";
	}
	
	
	

}
