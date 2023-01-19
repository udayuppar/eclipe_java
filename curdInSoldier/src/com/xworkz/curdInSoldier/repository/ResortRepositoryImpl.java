package com.xworkz.curdInSoldier.repository;

import org.springframework.stereotype.Component;

import com.xworkz.curdInSoldier.dto.ResortDto;

@Component
public class ResortRepositoryImpl implements ResortRepository {

	public ResortRepositoryImpl() {
		System.out.println("Running ResortRepositoryImpl...");
	}
	
	@Override
	public boolean save(ResortDto dto) {
		System.out.println("Running save ......");
		return false;
	}

}
