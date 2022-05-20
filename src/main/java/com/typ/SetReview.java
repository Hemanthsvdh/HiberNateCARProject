package com.typ;

import java.time.LocalDateTime;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SetReview {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Hema");
		EntityManager entityManager= entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction= entityManager.getTransaction();
		
		Review r= new Review();
		r.setSubject("worth for money");
		r.setContent("product is too good");
		r.setWriterName("Hemanth");
		
		entityTransaction.begin();
		entityManager.persist(r);
		entityTransaction.commit();
		
		System.out.println("---------------done---------");
	
	}
}
