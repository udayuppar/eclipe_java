package com.uday.curd.building.boot;

import com.uday.curd.building.DTO.BuildingDTO;
import com.uday.curd.building.DTO.Type;
import com.uday.curd.building.exceptions.InvalidDataException;
import com.uday.curd.building.repository.BuildingRepository;
import com.uday.curd.building.repository.BuildingRepositoryImlp;
import com.uday.curd.building.survice.BuildingSurvice;
import com.uday.curd.building.survice.BuildingSurviceImpl;

public class BuildingRunner {

	public static void main(String[] args) throws InvalidDataException  {
		
		BuildingDTO dto=new BuildingDTO(500, "Royal Arckid", "uday R", 200, Type.MALL);
		BuildingRepository repository=new BuildingRepositoryImlp();
		BuildingSurvice survice=new BuildingSurviceImpl(repository);
		try {
			survice.validateAndSave(dto);
		} catch (InvalidDataException e) {
			e.printStackTrace();
		}

	}

}
