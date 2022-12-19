package com.uday.curd.building.repository;

import com.uday.curd.building.DTO.BuildingDTO;

public interface BuildingRepository {
	
	boolean storeAndSave(BuildingDTO dto);

}
