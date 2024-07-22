package org.jsp.hibernatedemo;

import java.util.Scanner;

import javax.persistence.NoResultException;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class VerifyByPhoneAndPassword {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the phone number and password to verify the user");
		long phone=sc.nextLong();
		String password=sc.next();
		String qry="select u from User u where u.phone=?1 and u.password=?2";
		Session s=new Configuration().configure().buildSessionFactory().openSession();
		Query<User> q=s.createQuery(qry);
		q.setParameter(1, phone);
		q.setParameter(2, password);
		try {
			User u=q.getSingleResult();
			System.out.println("user id:"+u.getId());
			System.out.println("user name:"+u.getName());
			System.out.println("email id:"+u.getEmail());
			System.out.println("phone number:"+u.getPhone());
		}catch(NoResultException e) {
			System.out.println("invalid phone or password");
		}
	}
}
