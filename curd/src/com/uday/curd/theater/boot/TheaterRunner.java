package com.uday.curd.theater.boot;

import com.uday.curd.theater.DTO.Seats;
import com.uday.curd.theater.DTO.TheaterDto;
import com.uday.curd.theater.exceptions.InvalidTypeDateExceptions;
import com.uday.curd.theater.repository.TheaterRepository;
import com.uday.curd.theater.repository.TheaterRepositoryImpl;

import com.uday.curd.theater.survice.ThearterSurviceImpl;
import com.uday.curd.theater.survice.TheaterSurvice;

public class TheaterRunner {

	public static void main(String[] args) throws InvalidTypeDateExceptions {
		  
		
		TheaterDto dto=new TheaterDto(6, "PVR cinemas", "Navarang", Seats.VIP);
		TheaterRepository repository=new  TheaterRepositoryImpl();
		TheaterSurvice survice=new ThearterSurviceImpl(repository);
		try {
			survice.validateAndSave(dto);
		} catch (InvalidTypeDateExceptions e) {
			e.printStackTrace();
		}
	}

}
