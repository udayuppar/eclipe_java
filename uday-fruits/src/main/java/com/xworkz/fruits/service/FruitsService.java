package com.xworkz.fruits.service;

import java.util.Set;

import javax.validation.ConstraintViolation;


import com.xworkz.fruits.dto.FruitsDto;

public interface FruitsService {
	
	Set<ConstraintViolation<FruitsDto>> validateAndSave(FruitsDto dto);


	default FruitsDto findById(int id) {
		return null;
	}
}
