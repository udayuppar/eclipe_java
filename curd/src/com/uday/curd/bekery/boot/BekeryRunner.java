package com.uday.curd.bekery.boot;

import com.uday.curd.bekery.DTO.BekeryDto;
import com.uday.curd.bekery.DTO.FamousFor;
import com.uday.curd.bekery.exceptions.InvalidDataException;
import com.uday.curd.bekery.repository.BekeryRepository;
import com.uday.curd.bekery.repository.BekeryRepositoryImpl;
import com.uday.curd.bekery.survice.BekerySurvice;
import com.uday.curd.bekery.survice.BekerySurviceImpl;

public class BekeryRunner {

	public static void main(String[] args) throws InvalidDataException {
		
		
		BekeryDto dto=new BekeryDto("Appu Bekery", "uday R", "Shree Rampura", 8861539422l, FamousFor.CHACOLATE);
		BekeryRepository repository=new BekeryRepositoryImpl();
		BekerySurvice survice=new BekerySurviceImpl(repository);
		try {
			survice.validAndSave(dto);
		} catch (InvalidDataException e) {
			e.printStackTrace();
		}
		

	}

}
