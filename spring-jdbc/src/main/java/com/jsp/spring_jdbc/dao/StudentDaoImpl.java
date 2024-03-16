package com.jsp.spring_jdbc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.jsp.spring_jdbc.Student;
@Component("studentDao")
public class StudentDaoImpl implements StudentDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	/**
	 * @return the jdbcTemplate
	 */
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	/**
	 * @param jdbcTemplate the jdbcTemplate to set
	 */
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int insert(Student student) {
		 String query= "INSERT INTO student(id,name,city) VALUES(?,?,?)";
		 int result = this.jdbcTemplate.update(query,student.getId(),student.getName(),student.getCity());
		 return result;
	}

	@Override
	public int delete(int id) {
		String query= "DELETE FROM student WHERE id=?";
		 int result = this.jdbcTemplate.update(query, id);
		 return result;
	}

	@Override
	public int update(Student student) {
		String query= "UPDATE student SET name=?, city=? WHERE id=?";
		 int result = this.jdbcTemplate.update(query, student.getName(),student.getCity(),student.getId());
		 return result;
	}

	@Override
	public Student fetchOne(int id) {
		String query = "SELECT * FROM student WHERE id=?";
		RowMapper<Student> rowMapper = new RowMapperImpl();
		return jdbcTemplate.queryForObject(query, rowMapper, id);
		
	}

	@Override
	public List<Student> fetchAll() {
		String query = "SELECT * FROM student";
//		RowMapper<Student> rowMapper =  new RowMapperImpl();
		List<Student> students = jdbcTemplate.query(query, new RowMapperImpl());
		return students;
	}
	

}
