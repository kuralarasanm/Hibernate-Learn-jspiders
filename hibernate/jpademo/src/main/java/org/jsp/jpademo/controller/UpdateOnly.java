package org.jsp.jpademo.controller;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.jpademo.dto.Merchant;

public class UpdateOnly {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the merchant id to update details");
		int id=s.nextInt();
		EntityManager manager=Persistence.createEntityManagerFactory("dev").createEntityManager();
		Merchant m=manager.find(Merchant.class, id);
		if(m!=null) {
			System.out.println("enter the name,phone,email,gst number and password");
			m.setName(s.next());
			m.setPhone(s.nextLong());
			m.setEmail(s.next());
			m.setGst_number(s.next());
			m.setPassword(s.next());
			EntityTransaction transaction=manager.getTransaction();
			transaction.begin();
			transaction.commit();
			System.out.println("updated sucessful");
		}else {
			System.out.println("cannot update merchant, as the entered id is invalid");
		}
		s.close();
	}
}
