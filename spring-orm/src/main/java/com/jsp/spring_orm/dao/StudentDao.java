package com.jsp.spring_orm.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.jsp.spring_orm.dto.Student;

public class StudentDao {
	private HibernateTemplate hibernateTemplate;

	/**
	 * @return the hibernateTemplate
	 */
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	/**
	 * @param hibernateTemplate the hibernateTemplate to set
	 */
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	@Transactional
	public int insert(Student student) {
		Integer integer = (Integer)hibernateTemplate.save(student);
		return integer;
	}
	@Transactional
	public void update(Student student) {
		hibernateTemplate.update(student);
	}
	@Transactional
	public void delete(Student student) {
		hibernateTemplate.delete(student);
	}
	public Student fetchOne(int id){
		Student student = hibernateTemplate.get(Student.class, id);
		return student;
	}
	public List<Student> fetchAll(){
		List<Student> students = hibernateTemplate.loadAll(Student.class);
		return students;
	}

}
