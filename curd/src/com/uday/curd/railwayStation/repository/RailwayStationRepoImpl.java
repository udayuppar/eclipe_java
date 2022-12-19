package com.uday.curd.railwayStation.repository;

import com.uday.curd.railwayStation.DTO.RailwayStationDTO;
import com.uday.curd.railwayStation.exceptions.ArrayStoreFullExceptions;

public class RailwayStationRepoImpl implements RailwayStationRepository {

	private RailwayStationDTO[] dto=new RailwayStationDTO[10];
	private int store=0;
	
	
	
	@Override
	public boolean createAndStore(RailwayStationDTO train) {
		System.out.println("Running createAndStore...........");
		if(this.store>=this.dto.length) {
			System.out.println("Stores the length");
			throw new ArrayStoreFullExceptions("Array is full chech the data");
			
		}
		
		this.dto[this.store]=train;
		System.out.println("save:"+train+"store"+this.store);
		this.store++;
		
		return true;
	}

}
