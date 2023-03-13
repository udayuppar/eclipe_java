package com.xworkz.fruits.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.fruits.entity.FruitsEntity;

@Repository
public class FruitsRepositoryImpl implements FruitsRepository {

	@Autowired
	private EntityManagerFactory EntityManagerFactory;

	@Override
	public boolean save(FruitsEntity entity) {
		System.out.println("Running save in repository:" + entity);
		EntityManager entityManager = this.EntityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(entity);
		entityTransaction.commit();
		entityManager.close();
		return true;
	}

	@Override
	public FruitsEntity findById(int id) {
		System.out.println("Running find by id :" + id);

		EntityManager entityManager = this.EntityManagerFactory.createEntityManager();
		FruitsEntity fromDb = entityManager.find(FruitsEntity.class, id);
		entityManager.close();
		return fromDb;
	}

	@Override
	public List<FruitsEntity> findByName(String name) {
		System.out.println("Running Find by name in repo:" + name);
		EntityManager manager = this.EntityManagerFactory.createEntityManager();
		try {
			Query query = manager.createNamedQuery("findByName");

			query.setParameter("fruty", name);

			List<FruitsEntity> list = query.getResultList();

			System.out.println("Total list found in repo:" + list.size());

			return list;
		} finally {
			manager.close();
		}
	}

	@Override
	public List<FruitsEntity> findByLocation(String location) {
		System.out.println("Running Find by location:" + location);
		EntityManager manager = this.EntityManagerFactory.createEntityManager();
		System.out.println("this");
		try {
			Query query = manager.createNamedQuery("findByNameAndMobileNumberAndLocation");

			query.setParameter("loc", location);
			System.out.println("this is List");
			List<FruitsEntity> list = query.getResultList();
			
			System.out.println("Total list found in repo:" + list.size());

			return list;
		} finally {
			manager.close();
		}

	}

	@Override
	public boolean update(FruitsEntity entity) {
		System.out.println("Running update in repo:" + entity);
		EntityManager manager = this.EntityManagerFactory.createEntityManager();

		try {
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			manager.merge(entity);
			transaction.commit();
		} finally {
			manager.close();
		}
		return true;
	}

	@Override
	public FruitsEntity deleteById(int id) {
		EntityManager manager = this.EntityManagerFactory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		FruitsEntity delete = manager.find(FruitsEntity.class, id);
		transaction.begin();
		manager.remove(delete);
		transaction.commit();
		manager.close();
		return delete;
	}

	@Override
	public List<FruitsEntity> findAll() {
		// TODO Auto-generated method stub
		EntityManager entityManager = this.EntityManagerFactory.createEntityManager();
		try {
			Query query = entityManager.createNamedQuery("findAll");
			System.out.println("Query:" + query);
			List<FruitsEntity> list = query.getResultList();
			System.out.println(list);
			return list;
		} finally {
			entityManager.close();
		}

	}
	
	@Override
	public List<FruitsEntity> findByNameAndLocation(String name, String location) {
		System.out.println("Running FindByNAmeAndLocation:"+name+location);
		
		EntityManager manager=this.EntityManagerFactory.createEntityManager();
		try {
		Query query=manager.createNamedQuery("findByNameAndLocation");
		query.setParameter("fruty", name);
		query.setParameter("loc", location);
		System.out.println("Query:"+query);
		List<FruitsEntity> list=query.getResultList();
		System.out.println("List found in repo:"+list.size());
		return list;
		}finally {
			manager.close();
		}
		
		
	}

}
