package com.xworkz.collections.boot.DTO.eqauls.dto;

import java.io.Serializable;

public class AirportDto implements Serializable {
	
	private String name;
	private String location;
	private String type;
	
	
	public AirportDto() {
		// TODO Auto-generated constructor stub
	}


	public AirportDto(String name, String location, String type) {
		super();
		this.name = name;
		this.location = location;
		this.type = type;
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("Running equals method in Airport dto");
		
		if(obj!=null) {
			if(obj instanceof AirportDto) {
				AirportDto dto=(AirportDto) obj;
				if(dto.location.equals(this.location)) {
					System.out.println("location matching :"+location);
					return true;
				}
			}
			
		}
		return true;
		
	}


	@Override
	public String toString() {
		return "AirportDto [name=" + name + ", location=" + location + ", type=" + type + "]";
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}
	
	

}
