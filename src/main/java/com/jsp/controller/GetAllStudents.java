package com.jsp.controller;

import com.jsp.service.StudentService;

public class GetAllStudents {
	public static void main(String[] args) {
		StudentService ss = new StudentService();
		ss.getAllStudents();
	}


}
