package com.xworkz.curdInSoldier.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.curdInSoldier.dto.ResortDto;
import com.xworkz.curdInSoldier.repository.ResortRepository;

@Component
public class ResortSurviceImpl implements ResortSurvice {
	
	@Autowired
	private Validator validator;
	private ResortRepository repo;
	
	@Autowired
	public ResortSurviceImpl(ResortRepository repo) {
		this.repo=repo;
		System.out.println("Running ResortSurviceImpl....");
	}

	@Override
	public boolean validateAndSave(ResortDto dto) {
		System.out.println("Running validateAndSave...:"+dto);
		
		Set<ConstraintViolation<ResortDto>> violation=validator.validate(dto);
		
		if(!violation.isEmpty()) {
			System.out.println("There is an Violation error");
			return false;
		}
		else {
			System.out.println("Dto is saved..."+dto);
			boolean saved=repo.save(dto);
			return saved;
		}
		
	
	}

}
