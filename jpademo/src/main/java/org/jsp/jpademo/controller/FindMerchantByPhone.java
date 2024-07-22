package org.jsp.jpademo.controller;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.jsp.jpademo.dto.Merchant;

public class FindMerchantByPhone {
	public static void main(String[] args) {
		String jpql="select m from Merchant m where m.phone=?1";
		Scanner s=new Scanner(System.in);
		System.out.println("enter the merchant's phone number to print details");
		long phone=s.nextLong();
		EntityManager manager=Persistence.createEntityManagerFactory("dev").createEntityManager();
		Query q=manager.createQuery(jpql);
		q.setParameter(1, phone);
		try {
			Merchant m=(Merchant) q.getSingleResult();
			System.out.println("merchant id:"+m.getId());
			System.out.println("merchant name:"+m.getName());
			System.out.println("phone number:"+m.getPhone());
			System.out.println("email id:"+m.getEmail());
			System.out.println("gst number:"+m.getGst_number());
			System.out.println("------------------------------------");
		}catch(NoResultException e) {
			System.err.println("invalid phone number");
		}
		
	}
}
