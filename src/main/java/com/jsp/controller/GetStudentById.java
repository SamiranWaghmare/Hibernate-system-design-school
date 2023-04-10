package com.jsp.controller;

import com.jsp.dto.Student;
import com.jsp.service.StudentService;

public class GetStudentById {

	public static void main(String[] args) {
		StudentService ss = new StudentService();
		Student s1 = ss.getStudentById(1);
		System.out.println(s1.getId());
		System.out.println(s1.getName());
		System.out.println(s1.getEmail());
		System.out.println(s1.getStatus());

	}

}
