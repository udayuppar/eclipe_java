package com.uday.curd.building.repository;

import com.uday.curd.building.DTO.BuildingDTO;
import com.uday.curd.building.exceptions.ArrayFullOutOfBoundExceptions;

public class BuildingRepositoryImlp implements BuildingRepository {

	private BuildingDTO[] dtos = new BuildingDTO[10];
	private int index = 0;

	@Override
	public boolean storeAndSave(BuildingDTO dto) {

		System.out.println("Running storeAndSave ............: " + dto);

		if (this.index >= this.dtos.length) {
			System.out.println("store the Array length...");
			throw new ArrayFullOutOfBoundExceptions("Array is full check once again");
		}

		this.dtos[this.index] = dto;
		System.out.println("save:" + dto + "index:" +this. index);
		this.index++;

		return false;
	}

}
