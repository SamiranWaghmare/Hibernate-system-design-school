package com.jsp.controller;

import com.jsp.dto.Student;
import com.jsp.service.StudentService;

public class SaveStudent {

	public static void main(String[] args) {
		StudentService ss = new StudentService();
		Student s1 = new Student();
		
		s1.setName("Alex");
		s1.setEmail("alex@mail.com");
		s1.setStatus("approved");
		
		Student s2 = ss.saveStudent(s1);
		if(s2 != null) {
			System.out.println(s2.getName() + " student added to database");
		}
		
		
	}

}
