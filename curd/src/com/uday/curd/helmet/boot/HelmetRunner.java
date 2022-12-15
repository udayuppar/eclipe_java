package com.uday.curd.helmet.boot;

import com.uday.curd.helmet.DTO.HelmetDTO;
import com.uday.curd.helmet.DTO.HelmetType;
import com.uday.curd.helmet.repository.HelmetRepository;
import com.uday.curd.helmet.repository.HelmetRepositoryImpl;
import com.uday.curd.helmet.survice.HelmetSurvice;
import com.uday.curd.helmet.survice.HelmetSurviceImpl;

public class HelmetRunner {

	public static void main(String[] args) {
		
		
		HelmetDTO dto=new HelmetDTO("Vega Helmet", 500D, HelmetType.HALF, "Block");
		HelmetRepository repository=new HelmetRepositoryImpl();
		HelmetSurvice survice=new HelmetSurviceImpl(repository);
		 boolean success=survice.validateAndSave(dto);
		 System.out.println("Sucess:"+success);

	}

}
