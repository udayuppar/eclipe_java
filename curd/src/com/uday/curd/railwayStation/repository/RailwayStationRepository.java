package com.uday.curd.railwayStation.repository;

import com.uday.curd.railwayStation.DTO.RailwayStationDTO;

public interface RailwayStationRepository {

	boolean createAndStore(RailwayStationDTO train);
}
