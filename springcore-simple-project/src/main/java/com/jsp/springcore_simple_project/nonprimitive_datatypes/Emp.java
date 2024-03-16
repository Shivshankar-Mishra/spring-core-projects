package com.jsp.springcore_simple_project.nonprimitive_datatypes;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Emp {
	private String name;
	private List<Long> phones;
	private Set<String> addresses;
	private Map<String, String> courses;
	private Properties props;
	
	/**
	 * 
	 */
	public Emp() {
		super();
	}

	/**
	 * @param name
	 * @param phones
	 * @param addresses
	 * @param courses
	 */
	public Emp(String name, List<Long> phones, Set<String> addresses, Map<String, String> courses) {
		super();
		this.name = name;
		this.phones = phones;
		this.addresses = addresses;
		this.courses = courses;
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
	 * @return the phones
	 */
	public List<Long> getPhones() {
		return phones;
	}

	/**
	 * @param phones the phones to set
	 */
	public void setPhones(List<Long> phones) {
		this.phones = phones;
	}

	/**
	 * @return the addresses
	 */
	public Set<String> getAddresses() {
		return addresses;
	}

	/**
	 * @param addresses the addresses to set
	 */
	public void setAddresses(Set<String> addresses) {
		this.addresses = addresses;
	}

	/**
	 * @return the courses
	 */
	public Map<String, String> getCourses() {
		return courses;
	}
	

	/**
	 * @return the props
	 */
	public Properties getProps() {
		return props;
	}

	/**
	 * @param props the props to set
	 */
	public void setProps(Properties props) {
		this.props = props;
	}

	/**
	 * @param courses the courses to set
	 */
	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}

	@Override
	public String toString() {
		return "Emp [name=" + name + ", phones=" + phones + ", addresses=" + addresses + ", courses=" + courses
				+ ", props=" + props + "]";
	}

	
	
	

}
