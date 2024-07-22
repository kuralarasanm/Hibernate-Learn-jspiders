package org.jsp.OneToMany_bi.Controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.OneToMany_bi.dto.Merchant;
import org.jsp.OneToMany_bi.dto.Product;

public class SaveMerchantAndProducts {
	public static void main(String[] args) {
		Merchant m=new Merchant();
		m.setGst_number("abndjen1812");
		m.setName("kural");
		m.setPhone(123456456L);
		m.setPassword("sdfgh123");
		
		Product p1=new Product();
		p1.setBrand("electronics");
		p1.setCost(8000);
		p1.setName("phone");
		p1.setMerchant(m);
		
		Product p2=new Product();
		p2.setBrand("electronics");
		p2.setCost(85000);
		p2.setName("laptop");
		p2.setMerchant(m);
		
		List<Product> products=new ArrayList<Product>();
		products.add(p1);
		products.add(p2);
		m.setProducts(products);
		EntityManager manager=Persistence.createEntityManagerFactory("dev").createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		manager.persist(m);
		transaction.begin();
		transaction.commit();
	}
}
