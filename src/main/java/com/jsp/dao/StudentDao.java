package com.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.dto.Student;

public class StudentDao {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("sami");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	
	public Student saveStudent(Student s) {
		
		if(s != null) {
			et.begin();
			em.persist(s);
			et.commit();
			return s;
		}else {
			return s;
		}
	}
	
	public Student getStudentById(int id) {
		return em.find(Student.class, id);
	}
	
	public Student updateStudent(Student s) {
		if(s != null) {
			et.begin();
			em.merge(s);
			et.commit();
			return s;
		}else
			return null;
	}
	
	public Student deleteStudent(Student s) {
		if(s != null) {
			et.begin();
			em.remove(s);;
			et.commit();
			return s;
		}else
			return null;
		
	}
	
	public void getAllStudents() {
		String sql = "select s from Student s";
		Query query = em.createQuery(sql);
		List<Student> students = query.getResultList();
		for(Student s : students) {
			System.out.println(s.getId());
			System.out.println(s.getName());
			System.out.println(s.getEmail());
			System.out.println("============================");
		}
		
	}

}
