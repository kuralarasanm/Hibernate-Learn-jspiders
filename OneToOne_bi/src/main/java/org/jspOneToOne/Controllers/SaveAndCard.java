package org.jspOneToOne.Controllers;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.OneToOne.dto.Pancard;
import org.jsp.OneToOne.dto.User;

public class SaveAndCard {
	public static void main(String[] args) {
		User u=new User();
		u.setName("kural");
		u.setPhone(6380564945L);
		Pancard card=new Pancard();
		card.setDob(LocalDate.parse("2001-12-31"));
		card.setNumber("ginpm2312n");
		card.setPincode(635202);
		card.setUser(u);//assigning user to card
		u.setCard(card);//assigning card to user
		EntityManager manager=Persistence.createEntityManagerFactory("dev").createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		manager.persist(u);
		transaction.begin();
		transaction.commit();
	}
}
