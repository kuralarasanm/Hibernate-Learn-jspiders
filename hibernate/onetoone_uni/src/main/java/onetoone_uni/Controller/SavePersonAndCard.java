package onetoone_uni.Controller;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.onetooneuni.dto.AadharCard;
import org.jsp.onetooneuni.dto.Person;

public class SavePersonAndCard {
	public static void main(String[] args) {
		Person p=new Person();//Transient state
		p.setName("kural");
		p.setAge(21);
		p.setPhone(6380564945L);
		
		AadharCard card=new AadharCard();//Transient state
		card.setNumber(123456789012L);
		card.setDob(LocalDate.parse("2001-12-31"));
		card.setAddress("tamilnadu");
		p.setCard(card);//Assigning Aadharcard for person
		EntityManager manager=Persistence.createEntityManagerFactory("dev").createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		manager.persist(p);//persistant state
		manager.persist(card);
		transaction.begin();
		transaction.commit();
	}
}
