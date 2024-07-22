package org.jsp.hibernatedemo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class FetchNames {
	public static void main(String[] args) {
		//name only
//		String qry="select u.name from User u";
//		Session s=new Configuration().configure().buildSessionFactory().openSession();
//		Query<String> q=s.createQuery(qry);
//		List<String> names=q.getResultList();
//		for(String name:names) {
//			System.out.println(name);
//		}
		// id only
		String qry="select u.id from User u";
		Session s=new Configuration().configure().buildSessionFactory().openSession();
		Query<Integer> q=s.createQuery(qry);
		List<Integer> ids=q.getResultList();
		for(Integer id:ids) {
			System.out.println(id);
		}
	}
}
