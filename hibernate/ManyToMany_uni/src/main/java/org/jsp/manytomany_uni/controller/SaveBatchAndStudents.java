package org.jsp.manytomany_uni.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


import org.jsp.manytomany_uni.dto.Batch;
import org.jsp.manytomany_uni.dto.Student;

public class SaveBatchAndStudents {
	public static void main(String[] args) {
		Batch b1=new Batch();
		b1.setBatch_code("JBT-A4");
		b1.setSubject("Advanced Java");
		b1.setTrainer("gururaja");
		
		Batch b2=new Batch();
		b2.setBatch_code("JBT-A5");
		b2.setSubject("Hibernate");
		b2.setTrainer("sathish");
		
		Batch b3=new Batch();
		b3.setBatch_code("JBT-A3");
		b3.setSubject("react js");
		b3.setTrainer("harish");
		
		Student s1=new Student();
		s1.setName("messi");
		s1.setPerc(90);
		s1.setYop(2001);
		
		Student s2=new Student();
		s2.setName("ronaldo");
		s2.setPerc(90);
		s2.setYop(2000);
	
		Student s3=new Student();
		s3.setName("neymar");
		s3.setPerc(80);
		s3.setYop(2004);
		
		List<Student> forB1=new ArrayList<Student>(Arrays.asList(s1,s2,s3));
		List<Student> forB2=new ArrayList<Student>(Arrays.asList(s1,s3));
		List<Student> forB3=new ArrayList<Student>(Arrays.asList(s1,s2,s3));
		b1.setStudents(forB1);
		b2.setStudents(forB2);
		b3.setStudents(forB3);
		EntityManager manager=Persistence.createEntityManagerFactory("dev").createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		manager.persist(b1);
		manager.persist(b2);
		manager.persist(b3);
		transaction.begin();
		transaction.commit();
	}
}
