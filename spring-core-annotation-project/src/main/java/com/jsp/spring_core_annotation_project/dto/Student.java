package com.jsp.spring_core_annotation_project.dto;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	private int id;
	private String name;
	private String email;
	private long phone;
	public Student(@Value(value="1") int id, @Value(value="ram") String name, @Value(value="ram@mail.com") String email, @Value(value="676668683") long phone) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + ", phone=" + phone + "]";
	}
	

}
