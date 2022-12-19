package com.uday.curd.bekery.repository;

import com.uday.curd.bekery.DTO.BekeryDto;
import com.uday.curd.bekery.exceptions.ArrayFullOutOfBoundException;

public class BekeryRepositoryImpl implements BekeryRepository {

	private BekeryDto[] bekery=new BekeryDto[10];
	private int store=0;
	
	
	@Override
	public boolean storeAndSave(BekeryDto dto) {
		System.out.println("Running storeAndSave ...........");
		
		if(this.store>=this.bekery.length) {
			System.out.println("Array is stored");
			throw new ArrayFullOutOfBoundException("Array is fulled check....");
		}
		
		this.bekery[this.store]=dto;
		System.out.println("Save:"+dto+"Store:"+this.store);
		this.store++;
		return false;
	}

}
