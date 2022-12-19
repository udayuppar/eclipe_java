package com.uday.curd.railwayStation.DTO;

import java.time.LocalDateTime;

public class RailwayStationDTO extends AbstractAuditDto {

	private String name;
	private int noOfPlatforms;
	private String location;
	private int platformTicketPrice;

	public RailwayStationDTO() {
		System.out.println("Running RailwayStationDTO default const ");
	}

	public RailwayStationDTO(String name, int noOfPlatforms, String location, int platformTicketPrice,String createdBy, String updatedBy,LocalDateTime criatedDate,LocalDateTime updatedDate) {
		super();
		this.name = name;
		this.noOfPlatforms = noOfPlatforms;
		this.location = location;
		this.platformTicketPrice = platformTicketPrice;
	}

	@Override
	public String toString() {
		return "RailwayStationDTO [name=" + name + ", noOfPlatforms=" + noOfPlatforms + ", location=" + location
				+ ", platformTicketPrice=" + platformTicketPrice + ", toString()=" + super.toString() + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNoOfPlatforms() {
		return noOfPlatforms;
	}

	public void setNoOfPlatforms(int noOfPlatforms) {
		this.noOfPlatforms = noOfPlatforms;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getPlatformTicketPrice() {
		return platformTicketPrice;
	}

	public void setPlatformTicketPrice(int platformTicketPrice) {
		this.platformTicketPrice = platformTicketPrice;
	}

}
