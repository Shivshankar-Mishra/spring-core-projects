package com.jsp.springcore_simple_project.standalone_collection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Person {
	private String name;
	private List<String> phones;
	private Set<String> address;
	private Map<String, Integer> course;
	private Properties prop;
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
	 * @return the phones
	 */
	public List<String> getPhones() {
		return phones;
	}
	/**
	 * @param phones the phones to set
	 */
	public void setPhones(List<String> phones) {
		this.phones = phones;
	}
	/**
	 * @return the address
	 */
	public Set<String> getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(Set<String> address) {
		this.address = address;
	}
	/**
	 * @return the course
	 */
	public Map<String, Integer> getCourse() {
		return course;
	}
	/**
	 * @param course the course to set
	 */
	public void setCourse(Map<String, Integer> course) {
		this.course = course;
	}
	
	/**
	 * @return the prop
	 */
	public Properties getProp() {
		return prop;
	}
	/**
	 * @param prop the prop to set
	 */
	public void setProp(Properties prop) {
		this.prop = prop;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", phones=" + phones + ", address=" + address + ", course=" + course + ", prop="
				+ prop + "]";
	}
	
	

}
