package com.uday.curd.place.repository;

import com.uday.curd.place.DTO.PlaceDTO;

public interface PlaceRepository {
	
	default boolean storeAndSave(PlaceDTO dto) {
		return true;
	}

}
