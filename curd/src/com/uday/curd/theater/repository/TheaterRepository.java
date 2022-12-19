package com.uday.curd.theater.repository;

import com.uday.curd.theater.DTO.TheaterDto;

public interface TheaterRepository {

	boolean createAndSave(TheaterDto dto);
}
