package com.xworkz.festival.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FindMaxTotalDays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager manager=factory.createEntityManager();
		Query query=manager.createNamedQuery("findMaxTotalDays");
		Object object=query.getSingleResult();
		int i=(int)object;
		System.out.println(i);
		manager.close();

	}

}
