package com.uday.curd.place.survice;

import com.uday.curd.place.DTO.PlaceDTO;
import com.uday.curd.place.exceptions.InvalidDataExceptions;

public interface PlaceSurvice {
	
	default boolean validateAndSave(PlaceDTO dto) throws InvalidDataExceptions {
		return true;
	}

}
