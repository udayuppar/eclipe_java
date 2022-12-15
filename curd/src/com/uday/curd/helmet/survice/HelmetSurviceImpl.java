package com.uday.curd.helmet.survice;

import com.uday.curd.helmet.DTO.HelmetDTO;
import com.uday.curd.helmet.DTO.HelmetType;
import com.uday.curd.helmet.repository.HelmetRepository;

public class HelmetSurviceImpl implements HelmetSurvice {
	
	private HelmetRepository helmetRepository;
	
	public HelmetSurviceImpl(HelmetRepository helmetRepository) {
		this.helmetRepository=helmetRepository;
	}
	
	@Override
	public boolean validateAndSave(HelmetDTO helmetDTO) {
		System.out.println("Running validateAndSave....:"+helmetDTO);
		
		String name=helmetDTO.getName();
		String colour=helmetDTO.getColour();
		Double price=helmetDTO.getPrice();
		HelmetType type=helmetDTO.getType();
		boolean helmetName=false; 
		boolean helmetColour=false;
		boolean helmetPrice=false;
		boolean helmetType=false;
		
		
		if(name!=null && name.length()>=4 && name.length()<=20) {
			System.out.println("Name is valid:"+name);
		 helmetName=true;
		}else {
			System.err.println("Name is Invalid:"+name);
		}
		if(colour!=null && colour.length()>=3 && colour.length()<=20) {
			System.out.println("colour is valid:"+colour);
			 helmetColour =true;
		}else {
			System.err.println("colour is Invalid:"+colour);
			
		}
		if(price>=100 && price<=1000) {
			System.out.println("price is valid:"+price);
			 helmetPrice=true;
		}else {
			System.err.println("price is Invalid:"+price);
		}
		if(type!=null ) {
			System.out.println("type is valid:"+type);
			 helmetType=true;
		}else {
			System.err.println("type is Invalid:"+type);
		
		}
		if(helmetName && helmetColour && helmetPrice && helmetType) {
			System.out.println("DTO is valid");
			boolean save=this.helmetRepository.createAndSave(helmetDTO);
			System.out.println("Helmet DTO is saved:"+save);
			return save;
		}
		else {
			System.err.println("DTO is in valid");
		}
			
			
		
		
		return HelmetSurvice.super.validateAndSave(helmetDTO);
	}

}
