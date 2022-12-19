package com.uday.curd.building.survice;

import com.uday.curd.building.DTO.BuildingDTO;
import com.uday.curd.building.exceptions.InvalidDataException;

public interface BuildingSurvice {
	
	boolean validateAndSave(BuildingDTO dto) throws InvalidDataException;

}
