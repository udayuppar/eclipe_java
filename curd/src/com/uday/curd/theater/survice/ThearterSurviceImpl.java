package com.uday.curd.theater.survice;


import com.uday.curd.theater.DTO.Seats;
import com.uday.curd.theater.DTO.TheaterDto;
import com.uday.curd.theater.exceptions.InvalidTypeDateExceptions;
import com.uday.curd.theater.repository.TheaterRepository;

public class ThearterSurviceImpl implements TheaterSurvice {
	
	
	private TheaterRepository repository;
	
	
	public ThearterSurviceImpl(TheaterRepository repository) {
		this.repository=repository;
	}
	
	@Override
	public boolean validateAndSave(TheaterDto dtos) throws InvalidTypeDateExceptions {

		String name=dtos.getName();
		int id=dtos.getId();
		String brand=dtos.getBrand();
		Seats seats=dtos.getSeats();
		
		boolean theaterName=false;
		boolean theaterId=false;
		boolean theaterBrand=false;
		boolean theaterSeats=false;
		
		
		if(name!=null && name.length()>=3 && name.length()<=20) {
			System.out.println("name is valid:"+name);
			theaterName=true;
		}
		else {
			System.out.println("name is invalid:"+name);
		}
		System.out.println(System.lineSeparator());
		
		if(brand!=null && brand.length()>=3 && brand.length()<=20) {
			System.out.println("brand is valid:"+brand);
			theaterBrand=true;
		}
		else {
			System.out.println("name is invalid:"+brand);
		}
		System.out.println(System.lineSeparator());
		
		if (id>5 && id<=20) {
			System.out.println("id is valid:"+id);
			theaterId=true;
			
		}
		else {
			System.out.println("id is invalid:"+id);
		}
		System.out.println(System.lineSeparator());
		
		if(seats!=null ) {
			System.out.println("Seats is valid:"+seats);
			theaterSeats=true;
		}else {
			System.out.println("Seats is invalid:"+seats);
		}
		System.out.println(System.lineSeparator());
		
		if(theaterName && theaterId && theaterBrand && theaterSeats ) {
			System.out.println("Theater DTO is valid");
			
			 boolean save=this.repository.createAndSave(dtos);
			 System.out.println("Dto is saved successfully:"+save);
			 
			
			 
		}
		else {
			 throw new InvalidTypeDateExceptions("Data is invalid check once again");
		}
			
		
		
		return TheaterSurvice.super.validateAndSave(dtos);
	}

}
