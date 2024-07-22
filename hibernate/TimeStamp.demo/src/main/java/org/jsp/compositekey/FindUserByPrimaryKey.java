package org.jsp.compositekey;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class FindUserByPrimaryKey {
	public static void main(String[] args) {
		UserId userid=new UserId();
		userid.setEmail("abc@gmail.com");
		userid.setPhone(1234567890);
		
		EntityManager manager=Persistence.createEntityManagerFactory("dev").createEntityManager();
		User u=manager.find(User.class, userid);
		if(u!=null) {
			System.out.println("phone number:"+u.getUserid().getPhone());
			System.out.println("user name:"+u.getName());
			System.out.println("email id:"+u.getUserid().getEmail());
		}else {
			System.err.println("invalid phone number or email id");
		}
	}
}
