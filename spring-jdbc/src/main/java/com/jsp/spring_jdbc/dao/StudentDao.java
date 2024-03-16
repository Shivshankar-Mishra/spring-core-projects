package com.jsp.spring_jdbc.dao;

import java.util.List;

import com.jsp.spring_jdbc.Student;

public interface StudentDao {
	public int insert(Student student);
	public int delete(int id);
	public int update(Student student);
	public Student fetchOne(int id);
	public List<Student> fetchAll();

}
