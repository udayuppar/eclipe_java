package com.uday.curd.helmet.survice;

import com.uday.curd.helmet.DTO.HelmetDTO;

public interface HelmetSurvice {
	
	default boolean validateAndSave(HelmetDTO helmetDTO ) {
		return true;
	}

}
