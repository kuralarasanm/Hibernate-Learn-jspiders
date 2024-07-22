package org.jsp.hibernatedemo;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SaveUser {
	public static void main(String[] args) {
		User u=new User();
		u.setName("kural");
		u.setPassword("kural123");
		u.setEmail("kural@gmail.com");
		u.setPhone(6380564978L);
		Configuration cfg=new Configuration().configure();
		SessionFactory factory=cfg.buildSessionFactory();
		Session s=factory.openSession();
		Transaction t=s.beginTransaction();
		int id=(Integer)s.save(u);
		t.commit();
		System.out.println("user saved with Id:"+id);
	}
}
