package com.uday.curd.helmet.repository;

import com.uday.curd.helmet.DTO.HelmetDTO;

public interface HelmetRepository {
	
	 default boolean createAndSave(HelmetDTO helmet) {
		 return true;
	 }

}
