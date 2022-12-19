package com.uday.curd.railwayStation.survice;

import com.uday.curd.railwayStation.DTO.RailwayStationDTO;
import com.uday.curd.railwayStation.exceptions.InvalidDataExceptions;
import com.uday.curd.railwayStation.repository.RailwayStationRepository;

public class RailwayStationSurviceImpl implements RailwayStationSurvice {

	private RailwayStationRepository repository;
	
	public RailwayStationSurviceImpl(RailwayStationRepository repository) {
		System.out.println("Running RailwayStationSurviceImpl ");
	}
	
	
	@Override
	public boolean validateAndSave(RailwayStationDTO train) throws InvalidDataExceptions {
		String name=train.getName();
		int noOfPlatforms=train.getNoOfPlatforms();
		String location=train.getLocation();
		int ticket=train.getPlatformTicketPrice();
		
		boolean nameis=false;
		boolean noOfPlatformsis=false;
		boolean locationis=false;
		boolean ticketis=false;
		
		if(name!=null && name.length()>=4 && name.length()<20) {
			System.out.println("name is valid:"+name);
			nameis=true;
		}
		else {
			System.err.println("name is invalid:"+name);
		}
		if(location!=null && location.length()>=4 && location.length()<20) {
			System.out.println("location is valid:"+location);
			locationis=true;
		}
		else {
			System.err.println("location is invalid:"+location);
		}
		if(noOfPlatforms>=5 && noOfPlatforms<=25) {
			System.out.println("noOfPlatforms is valid:"+noOfPlatforms);
			noOfPlatformsis=true;
		}
		else {
			System.err.println("noOfPlatforms is invalid:"+noOfPlatforms);
		}
		if(ticket>=100 && ticket<=500) {
			System.out.println("ticket is valid:"+ticket);
			ticketis=true;
		}
		else {
			System.err.println("ticket is invalid:"+ticket);
		}
		if(nameis && locationis && noOfPlatformsis && ticketis ) {
			System.out.println("Dto is valid");
			boolean save=this.repository.createAndStore(train);
			System.out.println("saved sucessfully:"+save);
		}
		else {
			throw new InvalidDataExceptions("data is wrong please checks..........");
		}
		return true
				;
	}

}
