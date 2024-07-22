package org.jsp.hibernatedemo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class FindAllUsers {
	public static void main(String[] args) {
		String hql="select u from User u";
		Session s=new Configuration().configure().buildSessionFactory().openSession();
		Query<User> q=s.createQuery(hql);
		List<User> users=q.getResultList();
		for(User u:users) {
			System.out.println("user id:"+u.getId());
			System.out.println("user name:"+u.getName());
			System.out.println("email id"+u.getEmail());
			System.out.println("phone number:"+u.getPhone());
			System.out.println("-------------------------------");
		}
	}
}
