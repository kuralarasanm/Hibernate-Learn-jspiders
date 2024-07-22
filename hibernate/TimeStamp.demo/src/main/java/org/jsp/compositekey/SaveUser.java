package org.jsp.compositekey;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveUser {
	public static void main(String[] args) {
		UserId userid=new UserId();
		userid.setEmail("abc@gmail.com");
		userid.setPhone(1234567890);
		
		User u=new User();
		u.setUserid(userid);
		u.setName("abc");
		u.setPassword("abc123");
		
		EntityManager manager=Persistence.createEntityManagerFactory("dev").createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		manager.persist(u);
		transaction.begin();
		transaction.commit();
	}
}
