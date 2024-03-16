package com.jsp.spring_orm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jsp.spring_orm.dao.StudentDao;
import com.jsp.spring_orm.dto.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");
       StudentDao dao = applicationContext.getBean("studentDao", StudentDao.class);
       Student student = null;
       BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
       boolean running = true;
//       int choice;
       while(running) {
    	   System.out.println("***************Welcome to Spring ORM***************");
    	   System.out.println("1. Insert data\n2. Update Data\n3. Delete Data\n4. Display One Data\n5. Display All Data\n6. Exit");
    	   System.out.println("-------------------------");
    	   System.out.println("Please select the option no. :- ");
    	   try {
//    			int choice = ;
    			switch (Integer.parseInt(bufferedReader.readLine())) {
    			case 1:
    				System.out.println("+++++++++++++++++++++++++++++++++");
    				System.out.println("You Selected to insert data");
    				System.out.println("Please insert Student Details");
    				System.out.println("Enter student id: ");
    				student = new Student();
    				student.setStudentId(Integer.parseInt(bufferedReader.readLine()));
    				System.out.println("Enter student name: ");
    				student.setStudentName(bufferedReader.readLine());
    				System.out.println("Enter student city: ");
    				student.setStudentCity(bufferedReader.readLine());
    				int i = dao.insert(student);
    			       if(i>0) {
    			    	   System.out.println("Data Inserted");
    			       }
    			       else {
    			    	   System.out.println("something bad happened");
    			       }
    				
    				break;
    			case 2:
    				System.out.println("+++++++++++++++++++++++++++++++++");
    				System.out.println("You Selected to update data");
    				System.out.println("Please insert Student Details");
    				System.out.println("Enter student id where to updata data: ");
    				student = new Student();
    				student.setStudentId(Integer.parseInt(bufferedReader.readLine()));
    				System.out.println("Enter student name: ");
    				student.setStudentName(bufferedReader.readLine());
    				System.out.println("Enter student city: ");
    				student.setStudentCity(bufferedReader.readLine());
    				dao.update(student);
    				System.out.println("Data updated...");
    				
    				break;
    			case 3:
    				System.out.println("+++++++++++++++++++++++++++++++++");
    				System.out.println("You Selected to delete data");
    				System.out.println("Please insert Student Details");
    				System.out.println("Enter student id which have to delete: ");
    				student = dao.fetchOne(Integer.parseInt(bufferedReader.readLine()));
    				dao.delete(student);
    				System.out.println("Data Deleted...");
    				
    				break;
    			case 4:
    				System.out.println("+++++++++++++++++++++++++++++++++");
    				System.out.println("You Selected to display one data");
    				System.out.println("Please insert Student Details");
    				System.out.println("Enter student id which have to display: ");
    				student = dao.fetchOne(Integer.parseInt(bufferedReader.readLine()));
    				System.out.println(student);
    				
    				break;
    			case 5:
    				System.out.println("+++++++++++++++++++++++++++++++++");
    				System.out.println("You Selected to display all data");
    				List<Student> students = dao.fetchAll();
    				for(Student student2:students) {
    					System.out.println(student2);
    				}
    				
    				break;
    			case 6:
    				running = false;
    				System.out.println("+++++++++++++++");
    				System.out.println("Thank you");
    				System.out.println("*****************************************");
    				
    				break;

    			default:
    				System.out.println("Enter valid option....");
    				break;
    			}
    		} catch (IOException e) {
    			e.printStackTrace();
    		}
    	   
       }
       
    }
}
