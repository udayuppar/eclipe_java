package com.xworkz.bigBasket.service;

import java.util.Set;

import javax.validation.ConstraintViolation;

import com.xworkz.bigBasket.dto.BigBasketDto;

public interface BigBasketService {
	
	public Set<ConstraintViolation<BigBasketDto>> validateAndSave(BigBasketDto dto);

}
