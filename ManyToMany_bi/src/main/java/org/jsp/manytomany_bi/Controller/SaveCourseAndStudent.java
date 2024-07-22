//package org.jsp.manytomany_bi.Controller;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//import javax.persistence.EntityManager;
//import javax.persistence.EntityTransaction;
//import javax.persistence.Persistence;
//
//import org.jsp.manytomany_bi.dto.Course;
//import org.jsp.manytomany_bi.dto.Student1;
//
//public class SaveCourseAndStudent {
//	public static void main(String[] args) {
//		Course c=new Course();
//		c.setSubject("hibernate");
//		c.setDuration(6);
//		c.setTrainer("sathish");
//		
//		Student1 s=new Student1();
//		s.setName("kural");
//		s.setPerc(80);
//		s.setYop(2023);
//		
//		List<Student1> forB1=new ArrayList<Student1>(Arrays.asList(s));
//		c.setStudents(forB1);
//		EntityManager manager=Persistence.createEntityManagerFactory("dev").createEntityManager();
//		EntityTransaction transaction=manager.getTransaction();
//		manager.persist(c);
//		transaction.begin();
//		transaction.commit();
//	}
//}
