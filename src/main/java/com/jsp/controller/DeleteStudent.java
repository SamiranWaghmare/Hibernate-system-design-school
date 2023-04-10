package com.jsp.controller;

import com.jsp.dto.Student;
import com.jsp.service.StudentService;

public class DeleteStudent {

	public static void main(String[] args) {
		
		StudentService ss = new StudentService();
		Student s1 = ss.deleteStudent(1);
		if(s1 != null) {
			System.out.println(s1.getName() + " was removed from the records");
		}
	}

}
