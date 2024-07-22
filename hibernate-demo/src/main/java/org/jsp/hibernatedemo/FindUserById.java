package org.jsp.hibernatedemo;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FindUserById {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the user id to print the details");
		int id=sc.nextInt();
		Configuration cfg=new Configuration().configure();
		SessionFactory factory=cfg.buildSessionFactory();
		Session s=factory.openSession();
		User u=s.get(User.class, id);
		if(u!=null) {
			System.out.println("user id:"+u.getId());
			System.out.println("user name:"+u.getName());
			System.out.println("phone number:"+u.getPhone());
			System.out.println("email id"+u.getEmail());
		}else {
			System.err.println("you have entered an invalid id1");
		}
	}
}
