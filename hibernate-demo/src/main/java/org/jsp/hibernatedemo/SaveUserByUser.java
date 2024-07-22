package org.jsp.hibernatedemo;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SaveUserByUser {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter username");
		String name=sc.next();
		System.out.println("enter password");
		String password=sc.next();
		System.out.println("enter email");
		String email=sc.next();
		System.out.println("enter phone number");
		long phone=sc.nextLong();
		User u=new User();
		u.setName(name);
		u.setPassword(password);
		u.setEmail(email);
		u.setPhone(phone);
		Configuration cfg=new Configuration().configure();
		SessionFactory factory=cfg.buildSessionFactory();
		Session s=factory.openSession();
		Transaction t=s.beginTransaction();
		int id=(Integer)s.save(u);
		t.commit();
		System.out.println("user saved with Id:"+id);
	}
}
