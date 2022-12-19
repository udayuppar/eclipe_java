package com.uday.curd.theater.repository;

import com.uday.curd.theater.DTO.TheaterDto;
import com.uday.curd.theater.exceptions.ArrayFullOutOFException;

public class TheaterRepositoryImpl implements TheaterRepository {
	
	private TheaterDto[] dtos= new TheaterDto[10];
	private int index=0;

	@Override
	public boolean createAndSave(TheaterDto dto) {
		System.out.println("running createAndSave: "+dto);
		if(this.index>=this.dtos.length) {
			
			throw new ArrayFullOutOFException("Storage is full");
		}
		this.dtos[this.index]=dto;
		System.out.println("Save:"+dto+"index:"+this.index);
		this.index++;
		
		return true;
	}

}
