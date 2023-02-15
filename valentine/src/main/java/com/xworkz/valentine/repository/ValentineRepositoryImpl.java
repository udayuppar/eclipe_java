package com.xworkz.valentine.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.valentine.entity.ValentineEntity;
@Repository
public class ValentineRepositoryImpl implements ValentineRepository {

	@Autowired
	private EntityManagerFactory entityManagerFactory;
	
	public ValentineRepositoryImpl() {
		System.out.println("Create:" + this.getClass().getSimpleName());
	}

	@Override
	public boolean save(ValentineEntity entity) {
		System.out.println("Running save in repository" + entity);
		EntityManager entityManager= this.entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(entity);
		entityTransaction.commit();
		entityManager.close();
		return true;
	}

}
