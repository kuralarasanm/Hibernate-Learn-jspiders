package org.jsp.jpademo.controller;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.jpademo.dto.Merchant;

public class UpdateMerchant {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the merchant id to update");
		int id=s.nextInt();
		System.out.println("enter the name,phone,email,gst number and password");
		Merchant m=new Merchant();//Transient state
		m.setId(id);
		m.setName(s.next());
		m.setPhone(s.nextLong());
		m.setEmail(s.next());
		m.setGst_number(s.next());
		m.setPassword(s.next());
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("dev");
		EntityManager manager =factory.createEntityManager();
		m=manager.merge(m);//persistant state
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		transaction.commit();
		System.out.println("merchant updated with id"+m.getId());
	}
}
