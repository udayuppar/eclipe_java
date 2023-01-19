package com.xworkz.curdInSoldier.repository;

import org.springframework.stereotype.Component;

import com.xworkz.curdInSoldier.dto.MissileDto;

@Component
public class MissileRepositoryImpl implements MissileRepository {

	public MissileRepositoryImpl() {
		System.out.println("Running MissileRepositoryImpl......");
	}
	@Override
	public boolean save(MissileDto dto) {
		System.out.println("Runnning Save.....:");
		return false;
	}

}
