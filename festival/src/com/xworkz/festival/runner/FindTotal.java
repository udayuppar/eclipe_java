package com.xworkz.festival.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FindTotal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager manager=factory.createEntityManager();
		Query query=manager.createNamedQuery("findTotal");
		Object object=query.getSingleResult();
		long long1=(long)object;
		System.out.println(long1);
		manager.close();

	}

}
