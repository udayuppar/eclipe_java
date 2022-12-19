package com.uday.curd.bekery.repository;

import com.uday.curd.bekery.DTO.BekeryDto;

public interface BekeryRepository {
	
	boolean storeAndSave(BekeryDto dto);

}
