package com.uday.curd.place.survice;

import org.omg.CORBA.RepositoryIdHelper;

import com.uday.curd.place.DTO.FamousFor;
import com.uday.curd.place.DTO.PlaceDTO;
import com.uday.curd.place.exceptions.InvalidDataExceptions;
import com.uday.curd.place.repository.PlaceRepository;

public class PlaceSurviceImpl implements PlaceSurvice {

	private PlaceRepository repository;

	public PlaceSurviceImpl(PlaceRepository repository) {
		this.repository = repository;
	}

	@Override
	public boolean validateAndSave(PlaceDTO dto) throws InvalidDataExceptions {
		System.out.println("Running validateAndSave........ :" + dto);

		String name = dto.getName();
		int noOfTaluk = dto.getNoOfTaluk();
		FamousFor FamousFor = dto.getPlace();
		double population = dto.getPopulation();

		boolean nameis = false;
		boolean noOfTalukis = false;
		boolean Famousis = false;
		boolean populationis = false;

		if (name != null && name.length() >= 3 && name.length() <= 20) {
			System.out.println("name is valid:" + name);
			nameis = true;
		} else {
			System.err.println("name is invalid:" + name);
		}
		if (noOfTaluk > 10 && noOfTaluk < 30) {
			System.out.println("noOfTaluk is valid:" + noOfTaluk);
			noOfTalukis = true;
		} else {
			System.err.println("noOfTaluk is invalid:" + noOfTaluk);

		}

		if (FamousFor != null) {
			System.out.println("FamousFor is valid:" + FamousFor);
			Famousis = true;
		} else {
			System.err.println("Famousis is invalid:" + FamousFor);

		}

		if (population >= 400000 && population <= 1000000) {
			System.out.println("population is valid:" + population);
			populationis = true;
		} else {
			System.err.println("population is invalid:" + population);

		}
		
		if(nameis && noOfTalukis && Famousis && populationis) {
			System.out.println("Dto is valid");
			boolean save=this.repository.storeAndSave(dto);
			System.out.println("saved succesfully:"+save);
			
		}
		else {
			throw new InvalidDataExceptions("Data is invalid check once again");
		}

		return PlaceSurvice.super.validateAndSave(dto);
	}

}
