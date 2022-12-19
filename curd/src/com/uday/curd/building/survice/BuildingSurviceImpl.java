package com.uday.curd.building.survice;

import org.omg.CORBA.RepositoryIdHelper;

import com.uday.curd.building.DTO.BuildingDTO;
import com.uday.curd.building.DTO.Type;
import com.uday.curd.building.exceptions.InvalidDataException;
import com.uday.curd.building.repository.BuildingRepository;

public class BuildingSurviceImpl implements BuildingSurvice {
	
	private BuildingRepository repository;
	
	public BuildingSurviceImpl(BuildingRepository repository) {
		this.repository=repository;
	}

	@Override
	public boolean validateAndSave(BuildingDTO dto) throws InvalidDataException {
		System.out.println("Running validateAndSave...........:"+dto);
		
		String name=dto.getName();
		String ownerName=dto.getOwnerName();
		int no=dto.getNo();
		int noOfFloors=dto.getNoOfFloors();
		Type type=dto.getType();
		
		boolean nameis=false;
		boolean ownerNameis=false;
		boolean nois=false;
		boolean noOfFloorsis=false;
		boolean typeis=false;
		
		if(name!=null && name.length()>=3 && name.length()<=20) {
			System.out.println("name is valid:"+name);
			nameis=true;
		}
		else {
			System.err.println("Name is invalid:"+name);
		}
		if(ownerName!=null && ownerName.length()>=3 && ownerName.length()<=20) {
			System.out.println("ownerName is valid:"+ownerName);
			ownerNameis=true;
		}
		else {
			System.err.println("ownerName is invalid:"+ownerName);
		}
		if(no>100 && no<=1000) {
			System.out.println("no is valid:"+no);
			nois=true;
		}
		else {
			System.err.println("no is invalid:"+no);
		}
		if(noOfFloors>100 && noOfFloors<=1000) {
			System.out.println("noOfFloors is valid:"+noOfFloors);
			noOfFloorsis=true;
		}
		else {
			System.err.println("noOfFloors is invalid:"+noOfFloors);
		}
		
		if(type!=null) {
			System.out.println("type is valid:"+type);
			typeis=true;
		}
		else {
			System.err.println("type is invalid:"+type);
		}
			
		if(nameis && ownerNameis && nois && noOfFloorsis && typeis) {
			System.out.println("Dto is valid");
			boolean save=this.repository.storeAndSave(dto);
			System.out.println("dto is saved :"+save);
		}
		else {
			throw new InvalidDataException("data is invalid please check once again");
		}
		
		
		return false;
	}

}
