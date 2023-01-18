package com.xworkz.curdInSoldier.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.curdInSoldier.dto.SoldeirDto;
import com.xworkz.curdInSoldier.repository.SoldeirRepository;

public class SoldeirSurviceImpl implements SoldeirSurvice {
	
	private SoldeirRepository repository;
	
	public SoldeirSurviceImpl() {
		System.out.println("Running SoldeirSurviceImpl ......");
	}
	
	public void setRepository(SoldeirRepository repository) {
		this.repository = repository;
	}

	@Override
	public boolean validateAndSave(SoldeirDto dto) {
		System.out.println("Ruuning validateAndSave... "+dto);
		
		ValidatorFactory factory= Validation.buildDefaultValidatorFactory();
		Validator validator=factory.getValidator();
		Set<ConstraintViolation<SoldeirDto>> voilation=validator.validate(dto);
		
		if(!voilation.isEmpty()) {
			System.out.println("There is a Voilation error..");
			voilation.forEach(a->System.err.println("Voilating message: "+a.getMessage()));
		}
		else {
			System.out.println("There is no error DTO is passed");
			boolean saved=repository.save(dto);
			return saved;  
		}
		
		return false;
	}

}
