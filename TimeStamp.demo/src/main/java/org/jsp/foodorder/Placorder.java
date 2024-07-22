package org.jsp.foodorder;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Placorder {
	public static void main(String[] args) {
		Foodorder order=new Foodorder();
		order.setAddress("BTM layout");
		order.setFood_item("mutton briyani");
		order.setCost(270);
		EntityManager manager=Persistence.createEntityManagerFactory("dev").createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		manager.persist(order);
		transaction.begin();
		transaction.commit();
		System.out.println("order placed with id:"+order.getId());
	}
}
