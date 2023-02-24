package com.xworkz.bigBasket.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.bigBasket.entity.BigBasketEntity;

@Repository
public class BigBasketRepositoryImpl implements BigBasketRepository {
	
	@Autowired
	private EntityManagerFactory entityManagerFactory;

	public BigBasketRepositoryImpl() {
		System.out.println("Create:"+this.getClass().getSimpleName());
	}
	
	@Override
	public boolean save(BigBasketEntity Entity) {
		System.out.println("Running  save in repository"+Entity);
		
	EntityManager em=	this.entityManagerFactory.createEntityManager();
		EntityTransaction et=em.getTransaction();
		et.begin();
		em.persist(Entity);
		et.commit();
		em.close();
		return true;
	}

}
