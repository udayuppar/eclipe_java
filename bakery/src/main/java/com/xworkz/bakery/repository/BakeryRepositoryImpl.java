package com.xworkz.bakery.repository;

import org.springframework.stereotype.Repository;

import com.xworkz.bakery.dto.BakaryDto;

@Repository
public class BakeryRepositoryImpl implements BakeryRepository {

	public BakeryRepositoryImpl() {
		System.out.println("Create:"+this.getClass().getSimpleName());
	}
	
	@Override
	public boolean save(BakaryDto dto) {
		System.out.println("Running save method:"+dto);
		return false;
	}

}
