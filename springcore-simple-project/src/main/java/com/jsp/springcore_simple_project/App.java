package com.jsp.springcore_simple_project;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext applicationContext= new ClassPathXmlApplicationContext("config.xml");
        Student student1 = (Student)applicationContext.getBean("student1");
        Student student2 = (Student)applicationContext.getBean("student2");
        Student student3 = (Student)applicationContext.getBean("student3");
        Student student4 = (Student)applicationContext.getBean("student4");
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
        System.out.println(student4);
    }
}
