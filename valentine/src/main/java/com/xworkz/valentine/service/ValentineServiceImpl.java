package com.xworkz.valentine.service;

import java.util.Collections;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.valentine.dto.ValentineDto;
import com.xworkz.valentine.entity.ValentineEntity;
import com.xworkz.valentine.repository.ValentineRepository;

@Service
public class ValentineServiceImpl implements ValentineService {
	@Autowired
	private ValentineRepository valentineRepository;

	public ValentineServiceImpl() {
		System.out.println("Create:" + this.getClass().getSimpleName());
	}

	@Override
	public Set<ConstraintViolation<ValentineDto>> validateAndSave(ValentineDto dto) {
		System.out.println("Rinning validateAndSave in Service" + dto);

		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<ValentineDto>> violations = validator.validate(dto);

		if (violations != null && !violations.isEmpty()) {
			System.err.println("Violation in dto" + dto);
			return violations;
		} else {
			System.out.println("Violations is not there in dto save,,,,," + dto);

			ValentineEntity entity = new ValentineEntity();
			entity.setName(dto.getName());
			entity.setValentine(dto.getValentine());
			entity.setPlace(dto.getPlace());
			entity.setGift(dto.getGift());
			boolean saved = this.valentineRepository.save(entity);
			System.out.println("saved in service " + saved);
			return Collections.emptySet();

		}

	}

}
