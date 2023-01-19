package com.xworkz.curdInSoldier.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.curdInSoldier.dto.FirstAidDto;
import com.xworkz.curdInSoldier.repository.FirstAidRepository;

@Component

public class FirstAidSurviceImpl implements FirstAidSurvice {

	@Autowired
	private Validator validator;
	private FirstAidRepository repo;

	@Autowired
	public FirstAidSurviceImpl(FirstAidRepository repo) {
		this.repo = repo;
		System.out.println("Running FirstAidSurviceImpl... ");
	}

	@Override
	public boolean validateAndSave(FirstAidDto dto) {
		System.out.println("Running validateAndSave..." + dto);

		Set<ConstraintViolation<FirstAidDto>> vailation = this.validator.validate(dto);

		if (!vailation.isEmpty()) {
			System.out.println("There is an Vailation error");
			return false;
		}

		else {
			System.out.println("Dto is valid: " + dto);
			boolean saved = repo.save(dto);
			return saved;
		}
	}

}
