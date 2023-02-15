package com.xworkz.egg.service;

import java.util.Collection;
import java.util.Collections;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.stereotype.Service;

import com.xworkz.egg.dto.CMDto;
@Service
public class CMServiceImpl implements CMService {

	public CMServiceImpl() {
		System.out.println("Create:"+this.getClass().getSimpleName());
	}
	
	@Override
	public Set<ConstraintViolation<CMDto>> validateAndSave(CMDto dto) {
		System.out.println("Running validateAndSave");
		ValidatorFactory factory=Validation.buildDefaultValidatorFactory();
		Validator validator=factory.getValidator();
		  Set<ConstraintViolation<CMDto>> violation=validator.validate(dto);
		  
		  if(violation!=null && !violation.isEmpty()) {
			  System.out.println("violation exist, return violation");
			  return violation;
			  
		  }
		  else {
			  System.out.println("violation does not exist , Data is good");
			  return Collections.emptySet();
		  }
		
	}

}
