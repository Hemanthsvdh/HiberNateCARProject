package com.typ;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class GetOnlyAudiBrandFromCar {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Hema");
		EntityManager entityManager= entityManagerFactory.createEntityManager();		

		//String sql="SELECT c FROM Car c where c.brand=?1";
		String sql="SELECT c FROM Car c where c.brand=:mybrand";
		Query query=entityManager.createQuery(sql);
		//query.setParameter(1, "Audi");// position type query parameter
		query.setParameter("mybrand", "Audi");// Named type QueryParameter
		List<Car>  car=query.getResultList();
		if(car.size()>0) {
		for(Car c:car) {
			System.out.println("Id:" + c.getId());
			System.out.println("brandName: " + c.getBrand());
			System.out.println("gender: "+c.getCost());
			System.out.println("email :"+c.getType());
			

		}
		System.out.println("---------------Car data succefully fetched---------");
		}
		else {
			System.out.println("invalid password or mail");
		}
	}


}
