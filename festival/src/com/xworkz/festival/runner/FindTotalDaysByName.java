package com.xworkz.festival.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.xworkz.festival.entity.FestivalEntity;

public class FindTotalDaysByName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager manager=factory.createEntityManager();
		Query query=manager.createNamedQuery("findTotalDaysByName");
		query.setParameter("holiday", "Holi");
		Object object=query.getSingleResult();
		Integer entity=(Integer)object;
		System.out.println(entity);
		manager.close();

	}

}
