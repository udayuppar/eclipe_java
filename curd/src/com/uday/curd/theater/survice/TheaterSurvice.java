package com.uday.curd.theater.survice;

import com.uday.curd.theater.DTO.TheaterDto;
import com.uday.curd.theater.exceptions.InvalidTypeDateExceptions;

public interface TheaterSurvice {
	
	default boolean validateAndSave( TheaterDto dtos) throws InvalidTypeDateExceptions {
		return false;
		
	}

}
