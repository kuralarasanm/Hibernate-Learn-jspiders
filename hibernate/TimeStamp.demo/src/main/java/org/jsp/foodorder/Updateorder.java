package org.jsp.foodorder;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Updateorder {
	public static void main(String[] args) {
		EntityManager manager=Persistence.createEntityManagerFactory("dev").createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		Foodorder order=manager.find(Foodorder.class, 1);
		transaction.begin();
		order.setFood_item("briyani");
		transaction.commit();
	}
}
