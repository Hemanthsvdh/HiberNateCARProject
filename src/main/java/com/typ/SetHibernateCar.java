package com.typ;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class SetHibernateCar {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Hema");
		EntityManager entityManager= entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction= entityManager.getTransaction();
		
		Car c= new Car();
		c.setName("Benz2022");
		c.setBrand("Benz");
		c.setType("2022Benz1265");
		c.setCost(7000000);
		
		entityTransaction.begin();
		entityManager.persist(c);
		entityTransaction.commit();
		
		System.out.println("---------------done---------");
	
	}

}
