package org.jsp.OneToMany_uni.controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.OneToMany_uni.dto.Department;
import org.jsp.OneToMany_uni.dto.Employee;

public class SaveDeptAndEmps {
	public static void main(String[] args) {
		Department d=new Department();
		d.setName("development");
		d.setLocation("btm layout");
		Employee e1=new Employee();
		e1.setName("kural");
		e1.setDesg("developer");
		e1.setSalary(40000);
		
		Employee e2=new Employee();
		e2.setName("chandru");
		e2.setDesg("developer");
		e2.setSalary(40000);
		
		Employee e3=new Employee();
		e3.setName("hari");
		e3.setDesg("developer");
		e3.setSalary(40000);
		
		List<Employee> emps=new ArrayList<Employee>();
		emps.add(e1);
		emps.add(e2);
		emps.add(e3);
		d.setEmps(emps);
		EntityManager manager=Persistence.createEntityManagerFactory("dev").createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		manager.persist(d);
		transaction.begin();
		transaction.commit();
	}}
