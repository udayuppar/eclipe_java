package com.xworkz.festival.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.xworkz.festival.entity.FestivalEntity;


public class FindByIdAndName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager manager=factory.createEntityManager();
		Query query=manager.createNamedQuery("findByIdAndName");
		query.setParameter("name", "Ugadi");
		query.setParameter("id", 1);
		Object  object=query.getSingleResult();
		FestivalEntity entity=(FestivalEntity) object;
		System.out.println(entity);
		manager.close();

	}

}
