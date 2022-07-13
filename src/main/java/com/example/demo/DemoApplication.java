package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		//ApplicationContext context = SpringApplication.run(DemoApplication.class, args);


		//StudentService studentService = context.getBean(StudentService.class);

		//StudentList students = studentService.getAllStudents();

		//System.out.println(students.getStudentList().get(0).getName());
	}

	

}
