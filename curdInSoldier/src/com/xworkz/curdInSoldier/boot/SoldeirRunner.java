package com.xworkz.curdInSoldier.boot;

import com.xworkz.curdInSoldier.dto.SoldeirDto;
import com.xworkz.curdInSoldier.repository.SoldeirRepositoryImpl;
import com.xworkz.curdInSoldier.service.SoldeirSurviceImpl;

public class SoldeirRunner {

	public static void main(String[] args) {
		
		SoldeirDto dto=new SoldeirDto("Vinod", 105, "India", "Top rank", "Snipper");
		
		SoldeirSurviceImpl service=new SoldeirSurviceImpl();
		SoldeirRepositoryImpl repository=new SoldeirRepositoryImpl();
		service.setRepository(repository);
		
		service.validateAndSave(dto);

	}

}
