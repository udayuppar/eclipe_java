package com.uday.curd.railwayStation.survice;

import com.uday.curd.railwayStation.DTO.RailwayStationDTO;
import com.uday.curd.railwayStation.exceptions.InvalidDataExceptions;

public interface RailwayStationSurvice {

	boolean validateAndSave(RailwayStationDTO train) throws InvalidDataExceptions;
}
