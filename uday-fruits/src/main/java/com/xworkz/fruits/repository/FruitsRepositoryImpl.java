package com.xworkz.fruits.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.xworkz.fruits.entity.FruitsEntity;

@Repository
public class FruitsRepositoryImpl implements FruitsRepository {

	@Autowired
	private EntityManagerFactory EntityManagerFactory;
	
	@Override
	public boolean save(FruitsEntity entity) {
		System.out.println("Running save in repository:"+entity);
		EntityManager entityManager=this.EntityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(entity);
		entityTransaction.commit();
		entityManager.close();
		return true;
	}
	
	@Override
	public FruitsEntity findById(int id) {
		System.out.println("Running find by id :"+id);
		
		EntityManager entityManager=this.EntityManagerFactory.createEntityManager();
		FruitsEntity fromDb=entityManager.find(FruitsEntity.class, id);
		entityManager.close();
		return fromDb;
	}

}
