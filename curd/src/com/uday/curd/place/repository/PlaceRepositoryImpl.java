package com.uday.curd.place.repository;

import com.uday.curd.place.DTO.PlaceDTO;
import com.uday.curd.place.exceptions.ArrayStoreOutOfBoundExceptions;

public class PlaceRepositoryImpl implements PlaceRepository {

	PlaceDTO[] place = new PlaceDTO[10];
	private int store = 0;

	@Override
	public boolean storeAndSave(PlaceDTO dto) {
		System.out.println("Running storeAndSave.....:" + dto);
		if (this.store >= this.place.length) {
			throw new ArrayStoreOutOfBoundExceptions("Array is stored full check once again ");
		}
		this.place[this.store] = dto;
		System.out.println("Save:" + dto + "store:" + this.store);
		this.store++;

		return PlaceRepository.super.storeAndSave(dto);
	}

}
