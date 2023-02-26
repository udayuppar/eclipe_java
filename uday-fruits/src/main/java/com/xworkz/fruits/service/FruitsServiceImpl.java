package com.xworkz.fruits.service;

import java.util.Collections;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.fruits.dto.FruitsDto;
import com.xworkz.fruits.entity.FruitsEntity;
import com.xworkz.fruits.repository.FruitsRepository;



@Service
public class FruitsServiceImpl implements FruitsService {
	
	@Autowired
	private FruitsRepository repository;
	
	public FruitsServiceImpl() {
		System.out.println("Create:"+this.getClass().getSimpleName());
	}

	@Override
	public Set<ConstraintViolation<FruitsDto>> validateAndSave(FruitsDto dto) {
		System.out.println("Running validateAndSave in service:"+dto);
		
		ValidatorFactory factory=Validation.buildDefaultValidatorFactory();
		Validator validator=factory.getValidator();
		Set<ConstraintViolation<FruitsDto>> violations=validator.validate(dto);
		
		if(violations!=null && !violations.isEmpty()) {
			System.out.println("Violation in dto:"+dto);
			return violations;
		}
		else {
			System.out.println("There is no violation in dto save in controller:"+dto);
			
			FruitsEntity entity=new FruitsEntity();
			entity.setName(dto.getName());
			entity.setSelectFruits(dto.getSelectFruits());
			entity.setQuantity(dto.getQuantity());
			entity.setLocation(dto.getLocation());
			entity.setMobileNumber(dto.getMobileNumber());
			
			boolean saved=this.repository.save(entity);
			System.out.println("Saved:"+saved);
			return Collections.emptySet();
			
		}
		
	}
	
	@Override
	public FruitsDto findById(int id) {
		System.out.println("Running find by id in service: " + id);
		if (id > 0) {
			FruitsEntity entity = this.repository.findById(id);

			if (entity != null) {
				System.out.println("the entity is good convert value into dto");

				FruitsDto dto = new FruitsDto();
				
				dto.setName(entity.getName());
				dto.setSelectFruits(entity.getSelectFruits());
				dto.setQuantity(entity.getQuantity());
				dto.setLocation(entity.getLocation());
				dto.setMobileNumber(entity.getMobileNumber());
				return dto;
			}

		}
		return FruitsService.super.findById(id);
	}


}
