package com.typ;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;


public class GetUserCheckEamilandPassword {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Hema");
		EntityManager entityManager= entityManagerFactory.createEntityManager();		

		String sql="SELECT u FROM User u where u.email=?1 and u.password=:mypass";
		
		Query query=entityManager.createQuery(sql);
		query.setParameter(1, "mohaseen@GMAIL");// position type query parameter
		query.setParameter("mypass", "moha123");// Named type QueryParameter 
		
		List<User>  user=query.getResultList();
		if(user.size()>0) {
		for(User u:user) {
			System.out.println("Id:" + u.getId());
			System.out.println("Name: " + u.getName());
			System.out.println("gender: "+u.getGender());
			System.out.println("email :"+u.getEmail());
			

		}
		System.out.println("---------------User data succefully fetched---------");
		}
		else {
			System.out.println("invalid password or mail");
		}
	}

	
}
