package org.jsp.jpademo.controller;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import org.jsp.jpademo.dto.Merchant;

public class FindMerchantById {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the merchant id to display details");
		int id=s.nextInt();
		EntityManager manager=Persistence.createEntityManagerFactory("dev").createEntityManager();
		Merchant m=manager.find(Merchant.class, id);
		if(m!=null) {
			System.out.println("merchant id:"+m.getId());
			System.out.println("merchant name:"+m.getName());
			System.out.println("phone number:"+m.getPhone());
			System.out.println("email id:"+m.getEmail());
			System.out.println("gst number:"+m.getGst_number());
		}else {
			System.err.println("invalid merchant id");
		}
	}
}
