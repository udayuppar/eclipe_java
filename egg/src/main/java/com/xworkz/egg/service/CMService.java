package com.xworkz.egg.service;

import java.util.Set;

import javax.validation.ConstraintViolation;

import com.xworkz.egg.dto.CMDto;

public interface CMService {
	
	 Set<ConstraintViolation<CMDto>> validateAndSave(CMDto dto);

}
