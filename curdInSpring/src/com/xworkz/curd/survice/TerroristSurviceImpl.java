package com.xworkz.curd.survice;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.curd.dto.TerroristDto;

public class TerroristSurviceImpl implements TerroristSurvice {
	
	public TerroristSurviceImpl() {
		System.out.println("Creating TerroristSurviceImpl using no-arg const");
	}

	@Override
	public boolean validateAndSave(TerroristDto dto) {
		System.out.println("Executing validateAndSave  ");
		System.out.println("Dto passed:"+dto);
		
		ValidatorFactory factory=Validation.buildDefaultValidatorFactory();
		Validator validator=factory.getValidator();
		Set<ConstraintViolation<TerroristDto>> voilations=validator.validate(dto);
		if(!voilations.isEmpty()) {
			System.err.println("Error is There");
			voilations.forEach(c->System.err.println(c.getMessage()));
			return false;
		}
		
		return true;
	}

}
