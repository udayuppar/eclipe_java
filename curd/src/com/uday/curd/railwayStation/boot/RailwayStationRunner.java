package com.uday.curd.railwayStation.boot;

import java.time.LocalDateTime;

import com.uday.curd.railwayStation.DTO.RailwayStationDTO;
import com.uday.curd.railwayStation.exceptions.InvalidDataExceptions;
import com.uday.curd.railwayStation.repository.RailwayStationRepoImpl;
import com.uday.curd.railwayStation.repository.RailwayStationRepository;
import com.uday.curd.railwayStation.survice.RailwayStationSurvice;
import com.uday.curd.railwayStation.survice.RailwayStationSurviceImpl;

public class RailwayStationRunner {

	public static void main(String[] args) throws InvalidDataExceptions {
		
		
		RailwayStationDTO dto=new RailwayStationDTO("KSR Bengalur", 10, "Mejestic", 100, "System", "Uday", LocalDateTime.now(), LocalDateTime.of(2023, 1, 2, 2, 20));
		RailwayStationRepository repository=new RailwayStationRepoImpl();
		RailwayStationSurvice survice=new RailwayStationSurviceImpl(repository);
		
		try {
			survice.validateAndSave(dto);
		} catch (InvalidDataExceptions e) {
			e.printStackTrace();
		}
		
	}

}
