package com.xworkz.aeroplane.service;

import java.util.Collections;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.aeroplane.dto.AeroplaneDto;
import com.xworkz.aeroplane.entity.AeroplaneEntity;
import com.xworkz.aeroplane.repository.AeroplaneRepository;

@Service
public class AeroplaneServiceImpl implements AeroplaneService {

	@Autowired
	private AeroplaneRepository repository;

	public AeroplaneServiceImpl() {
		System.out.println("Create:" + this.getClass().getSimpleName());
	}

	@Override
	public Set<ConstraintViolation<AeroplaneDto>> validateAndSave(AeroplaneDto aeroplaneDto) {
		System.out.println("Running validateAndSave" + aeroplaneDto);

		ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
		Validator validator = validatorFactory.getValidator();
		Set<ConstraintViolation<AeroplaneDto>> violations = validator.validate(aeroplaneDto);

		if (violations != null && !violations.isEmpty()) {
			System.out.println("Violation in dto :" + aeroplaneDto);
			return violations;
		}

		else {
			System.out.println("There is no violation in dto save the data:" + aeroplaneDto);

			AeroplaneEntity entity = new AeroplaneEntity();
			entity.setCompany(aeroplaneDto.getCompany());
			entity.setName(aeroplaneDto.getName());
			entity.setCost(aeroplaneDto.getCost());
			entity.setType(aeroplaneDto.getType());
			entity.setCountry(aeroplaneDto.getCountry());

			boolean saved = this.repository.save(entity);
			System.out.println("saved:" + saved);
			return Collections.emptySet();

		}

	}

	@Override
	public AeroplaneDto findById(int id) {
		System.out.println("Running find by id in service: " + id);
		if (id > 0) {
			AeroplaneEntity entity = this.repository.findById(id);

			if (entity != null) {
				System.out.println("the entity is good convert value into dto");

				AeroplaneDto dto = new AeroplaneDto();
				dto.setCompany(entity.getCompany());
				dto.setName(entity.getName());
				dto.setCost(entity.getCost());
				dto.setType(entity.getType());
				dto.setCountry(entity.getCountry());
				return dto;
			}

		}
		return AeroplaneService.super.findById(id);
	}

}
