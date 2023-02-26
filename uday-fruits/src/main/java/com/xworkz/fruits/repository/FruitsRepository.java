package com.xworkz.fruits.repository;


import com.xworkz.fruits.entity.FruitsEntity;

public interface FruitsRepository {
	
	boolean save(FruitsEntity entity);
	

	default FruitsEntity findById(int id) {
		return null;
	}

}
