package org.jsp.hibernatedemo;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeleteUser {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the user id to delete the record");
		int id=sc.nextInt();
		Session s=new Configuration().configure().buildSessionFactory().openSession();
		User u=s.get(User.class, id);
		if(u!=null) {
			s.delete(u);
			Transaction t=s.beginTransaction();
			t.commit();
			System.out.println("user deleted");
		}else {
			System.out.println("cannot delete user,as entered invalid id");
		}
	}
}
