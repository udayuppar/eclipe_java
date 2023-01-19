package com.xworkz.curdInSoldier.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.curdInSoldier.dto.MissileDto;
import com.xworkz.curdInSoldier.dto.ResortDto;
import com.xworkz.curdInSoldier.repository.MissileRepository;

@Component
public class MissileSurviceImpl implements MissileSurvice {

	@Autowired
	private Validator validator;
	private MissileRepository repo;

	public MissileSurviceImpl(MissileRepository repo) {
		this.repo = repo;
	}

	@Override
	public boolean validateAndSave(MissileDto dto) {
		System.out.println("Running validateAndSave........:" + dto);

		Set<ConstraintViolation<MissileDto>> violation = validator.validate(dto);

		if (!violation.isEmpty()) {
			System.out.println("There is an Violation error");
			return false;
		} else {
			System.out.println("Dto is saved..." + dto);
			boolean saved = repo.save(dto);
			return saved;
		}
	}

}
