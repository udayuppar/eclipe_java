package com.xworkz.aeroplane.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.aeroplane.entity.AeroplaneEntity;

@Repository
public class AeroplaneRepositoryImpl implements AeroplaneRepository {

	@Autowired
	private EntityManagerFactory entityManagerFactory;
	
	public AeroplaneRepositoryImpl() {
		System.out.println("Create:"+this.getClass().getSimpleName());
	}
	
	@Override
	public boolean save(AeroplaneEntity entity) {
		System.out.println("Running save in repository:"+entity);
		EntityManager entityManager= this.entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(entity);
		entityTransaction.commit();
		entityManager.close();
		return true;
	}
	
	@Override
	public AeroplaneEntity findById(int id) {
		System.out.println("Running find by id :"+id);
		
		EntityManager entityManager=this.entityManagerFactory.createEntityManager();
		AeroplaneEntity fromDb=entityManager.find(AeroplaneEntity.class, id);
		entityManager.close();
		return fromDb;
	}

}
