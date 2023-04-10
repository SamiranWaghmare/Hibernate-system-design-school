package com.jsp.service;

import com.jsp.dao.StudentDao;
import com.jsp.dto.Student;

public class StudentService {
	
	StudentDao sDao = new StudentDao();
	
	public Student saveStudent(Student s) {
		if(s != null) {
			s.setStatus("unapproved");
		}
		return sDao.saveStudent(s);
	}
	
	public Student getStudentById(int id) {
		return sDao.getStudentById(id);
	}
	
	public Student updateStudent(Student s, int id) {
		Student s2 = sDao.getStudentById(id);
		if(s.getName() != null)
			s2.setName(s.getName());
		if(s.getEmail() != null)
			s2.setEmail(s.getEmail());
		if(s2 != null)
			return sDao.updateStudent(s2);
		return null;
		
	}
	
	public Student deleteStudent(int id) {
		Student s1 = sDao.getStudentById(id);
		if(s1 != null) {
			return sDao.deleteStudent(s1);
		}
		return null;
	}
	
	public void getAllStudents() {
		sDao.getAllStudents();
	}

}
