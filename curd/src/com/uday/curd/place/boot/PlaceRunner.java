package com.uday.curd.place.boot;

import com.uday.curd.place.DTO.FamousFor;
import com.uday.curd.place.DTO.PlaceDTO;
import com.uday.curd.place.exceptions.InvalidDataExceptions;
import com.uday.curd.place.repository.PlaceRepository;
import com.uday.curd.place.repository.PlaceRepositoryImpl;
import com.uday.curd.place.survice.PlaceSurvice;
import com.uday.curd.place.survice.PlaceSurviceImpl;

public class PlaceRunner {

	public static void main(String[] args) {
		
		PlaceDTO dto=new PlaceDTO("Chikkamagalur", 15, FamousFor.MULLAYANGIRI_PEAK, 600000);
		PlaceRepository repository=new PlaceRepositoryImpl();
		PlaceSurvice survice=new PlaceSurviceImpl(repository);
		try {
			survice.validateAndSave(dto);
		} catch (InvalidDataExceptions e) {
			e.printStackTrace();
		}

	}

}
