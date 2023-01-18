package com.xworkz.curdInSoldier.repository;

import com.xworkz.curdInSoldier.dto.SoldeirDto;

public class SoldeirRepositoryImpl implements SoldeirRepository {

	public SoldeirRepositoryImpl() {
		System.out.println("Running SoldeirRepositoryImpl....... ");
	}
	
	@Override
	public boolean save(SoldeirDto dto) {
		System.out.println("Ruuning  save ......."+dto);
		return false;
	}

}
