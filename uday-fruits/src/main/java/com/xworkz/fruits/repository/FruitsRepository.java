package com.xworkz.fruits.repository;

import java.util.Collections;
import java.util.List;

import com.xworkz.fruits.entity.FruitsEntity;

public interface FruitsRepository {

	boolean save(FruitsEntity entity);
	
	boolean update(FruitsEntity entity);
	
	default FruitsEntity deleteById(int id) {
		return null;
	}

	default FruitsEntity findById(int id) {
		return null;
	}

	default List<FruitsEntity> findByName(String name) {
		return Collections.emptyList();
	}
	
	default List<FruitsEntity> findByLocation(String location) {
		return Collections.emptyList();
	}

}
