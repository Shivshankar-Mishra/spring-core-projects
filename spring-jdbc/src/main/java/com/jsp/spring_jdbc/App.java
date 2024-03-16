package com.jsp.spring_jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.jsp.spring_jdbc.dao.StudentDao;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Program Started -------------" );
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");
//        StudentDao dao = applicationContext.getBean("studentDao", StudentDao.class);
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(JdbcConfig.class);
        StudentDao dao = applicationContext.getBean("studentDao", StudentDao.class);
        Student student = new Student();
        student.setId(2);
        student.setName("Mahadev");
        student.setCity("Soraon");
//        int i = dao.insert(student);
//        if(i>0) {
//        	System.out.println("Data inserted");
//        }
//        else {
//        	System.out.println("SOmething Bad Happend");
//        }
//        int i = dao.delete(3);
//        if(i>0) {
//        	System.out.println("Data deleted");
//        }
//        else {
//        	System.out.println("SOmething Bad Happend");
//        }
//        int i = dao.update(student);
//        if(i>0) {
//        	System.out.println("Data updated");
//        }
//        else {
//        	System.out.println("SOmething Bad Happend");
//        }
//        Student std = dao.fetchOne(1);
//        if(std!=null) {
//        	System.out.println(std);
//        }
//        else {
//        	System.out.println("SOmething Bad Happend");
//        }
        List<Student> students = dao.fetchAll();
        if(students!=null) {
        	for(Student std : students) {
        	System.out.println(std);
        	}
        }
        else {
        	System.out.println("SOmething Bad Happend");
        }
    }
}
