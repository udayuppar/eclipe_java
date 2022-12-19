package com.uday.curd.bekery.survice;

import com.uday.curd.bekery.DTO.BekeryDto;
import com.uday.curd.bekery.exceptions.InvalidDataException;

public interface BekerySurvice {
	
	boolean validAndSave(BekeryDto dto) throws InvalidDataException;

}
