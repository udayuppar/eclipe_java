package com.xworkz.fruits.service;

import java.util.Collections;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;

import com.xworkz.fruits.dto.FruitsDto;

public interface FruitsService {

	Set<ConstraintViolation<FruitsDto>> validateAndSave(FruitsDto dto);

	Set<ConstraintViolation<FruitsDto>> validateAndUpdate(FruitsDto dto);

	default FruitsDto deleteById(int id) {
		return null;
	}

	default FruitsDto findById(int id) {
		return null;
	}

	default List<FruitsDto> findByName(String name) {
		return Collections.emptyList();
	}

	default List<FruitsDto> findByLocation(String location) {
		return Collections.emptyList();
	}
	
	default List<FruitsDto> findAll() {
		return Collections.emptyList();
	}
	default List<FruitsDto> findByNameAndLocation(String name,String location) {
		return Collections.emptyList();
	}
}
