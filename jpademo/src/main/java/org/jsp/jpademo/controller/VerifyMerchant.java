package org.jsp.jpademo.controller;



import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.jsp.jpademo.dto.Merchant;



public class VerifyMerchant {

	public static void main(String[] args) {
		System.out.println("1.verify Merchant By Phone and Password");
		System.out.println("2.verify Merchant By Email and Password");
		System.out.println("3.verify Merchant By Id and Password");
		Scanner s=new Scanner(System.in);
		int choice=s.nextInt();
		EntityManager manager=Persistence.createEntityManagerFactory("dev").createEntityManager();
		Query q=null;
		switch(choice) {
		case 1:{
			q=manager.createNamedQuery("verifyByPhone");
			System.out.println("Enter the phone and password");
			q.setParameter(1, s.nextLong());
			q.setParameter(2, s.next());
			break;
		}
		case 2:{
			q=manager.createNamedQuery("verifyByEmail");
			System.out.println("Enter the email and password");
			q.setParameter(1, s.next());
			q.setParameter(2, s.next());
		}
		case 3:{
			q=manager.createNamedQuery("verifyById");
			System.out.println("Enter the id and password");
			q.setParameter(1, s.nextInt());
			q.setParameter(2, s.next());
			break;
		}
		}
		try {
			Merchant m=(Merchant)q.getSingleResult();
			System.out.println("merchant id:"+m.getId());
			System.out.println("merchant name:"+m.getName());
			System.out.println("merchant phone:"+m.getPhone());
			System.out.println("email:"+m.getEmail());
		}catch(NoResultException e) {
			System.err.println("Invalid phone or email or id or password");
		}
		s.close();
	}

}
