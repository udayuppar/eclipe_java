package com.xworkz.curdInSoldier.repository;

import javax.validation.Validator;

import org.springframework.stereotype.Component;

import com.xworkz.curdInSoldier.dto.FirstAidDto;

@Component

public class FirstAidRepositoryImpl implements FirstAidRepository {

	public FirstAidRepositoryImpl() {

		System.out.println("Ruuning FirstAidRepositoryImpl......");
	}

	@Override
	public boolean save(FirstAidDto dto) {
		System.out.println("Running Save ...........");
		return false;
	}

}
