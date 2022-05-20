package com.typ;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveUser {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Hema");
		EntityManager entityManager= entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction= entityManager.getTransaction();
		
		User user= new User();
		 user.setName("mohaseen");
	    user.setEmail("mohaseen@GMAIL");
		 user.setPassword("moha123");
		 user.setGender("Male");
		
		entityTransaction.begin();
		entityManager.persist( user);
		entityTransaction.commit();
		
		System.out.println("---------------User data succefully saved---------");
	
	}
}
