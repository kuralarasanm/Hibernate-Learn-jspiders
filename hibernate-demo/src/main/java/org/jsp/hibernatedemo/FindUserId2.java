package org.jsp.hibernatedemo;

import java.util.Scanner;

import javax.persistence.NoResultException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class FindUserId2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		System.out.println("enter the user id to print the details");
//		int id=sc.nextInt();
//		System.out.println("enter the user name to print the details");
//		String name=sc.next();
//		System.out.println("enter the user phone to print the details");
//		long phone=sc.nextLong();
		System.out.println("enter the user email to print the details");
		String email=sc.next();
		Session s=new Configuration().configure().buildSessionFactory().openSession();
//		String hql="select u from User u where u.id=:id";
//		String hql="select u from User u where u.name=:name";
//		String hql="select u from User u where u.phone=:phone";
		String hql="select u from User u where u.email=:email";
		Query<User> q=s.createQuery(hql);
//		q.setParameter("id", id);
//		q.setParameter("name", name);
//		q.setParameter("phone", phone);
		q.setParameter("email", email);
		
		try {
			User u=q.getSingleResult();
			System.out.println("user id:"+u.getId());
			System.out.println("user name:"+u.getName());
			System.out.println("phone number:"+u.getPhone());
			System.out.println("email id"+u.getEmail());
		}catch(NoResultException e) {
			System.err.println("you have entered an invalid id");
		}

	}
}
