package org.jsp.jpademo.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.jsp.jpademo.dto.Merchant;



public class FindAllMerchants {
	public static void main(String[] args) {
		String jpql="select m from Merchant m";
		EntityManager manager=Persistence.createEntityManagerFactory("dev").createEntityManager();
		Query q=manager.createQuery(jpql);
		List<Merchant> merchants=q.getResultList();
		for(Merchant m:merchants) {
			System.out.println("merchant id:"+m.getId());
			System.out.println("merchant name:"+m.getName());
			System.out.println("phone number:"+m.getPhone());
			System.out.println("email id:"+m.getEmail());
			System.out.println("gst number:"+m.getGst_number());
			System.out.println("------------------------------------");
		}
	}
}
