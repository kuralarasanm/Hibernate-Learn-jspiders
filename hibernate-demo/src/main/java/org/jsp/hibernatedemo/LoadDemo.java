package org.jsp.hibernatedemo;

import java.util.Scanner;

import org.hibernate.ObjectNotFoundException;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class LoadDemo {
	public static void main(String[] args) {
		Session s=new Configuration().configure().buildSessionFactory().openSession();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the user id to print the details");
		int id=sc.nextInt();
		User u=s.load(User.class, id);
		try {
			System.out.println("user id:"+u.getId());
			System.out.println("user name:"+u.getName());
			System.out.println("email id:"+u.getEmail());
			System.out.println("phone number:"+u.getPhone());
		} catch(ObjectNotFoundException e) {
			e.printStackTrace();
			System.err.println("you have entered an invalid id");
		}
	}
}
