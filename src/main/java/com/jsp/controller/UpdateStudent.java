package com.jsp.controller;

import com.jsp.dto.Student;
import com.jsp.service.StudentService;

public class UpdateStudent {

	public static void main(String[] args) {
		StudentService ss = new StudentService();
		Student s1 = new Student();
		s1.setName("morgan");
		s1.setEmail("mrg@mail.com");
		
		Student s2 = ss.updateStudent(s1, 2);
		if(s2 != null)
			System.out.println("record sucessfully updated");

	}

}
