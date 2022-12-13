package com.uday.curd.ipl.boot;

import java.time.LocalDateTime;

import com.uday.curd.ipl.dto.WarDTO;
import com.uday.curd.ipl.repositiory.WarRepositoryImpl;

public class WarRunner {

	public static void main(String[] args) {
		 WarRepositoryImpl ipml=new WarRepositoryImpl();
		 WarDTO dtos=new WarDTO();
		 dtos.setName("Rusia Ukrain War");
		 dtos.setStartDate(null);
		 dtos.setEndDate(null);
		 dtos.setStartedBy("Rusia");
		 dtos.setStartedWith("Ukrain");
		 dtos.setWinBy("Rusia");
		 dtos.setNoOfDeaths(500);
		 dtos.setCriatedBy("Uday");
		 dtos.setCriatedDate(LocalDateTime.now());
		 dtos.setUpdatedBy("Ajay");
		 dtos.setUpdatedDate(LocalDateTime.now()  );
		ipml.create(dtos);
		
		System.out.println(System.lineSeparator());
		System.out.println(ipml.findByStartedBy("Rusia"));
		System.out.println(System.lineSeparator());
		
		System.out.println(ipml.findByStartedByAndStartedWith("Rusia", "Ukrain"));
		System.out.println(System.lineSeparator());
		
		System.out.println(ipml.findByStartDateGreaterThanOrEqualTo(null));
		System.out.println(System.lineSeparator());
		
		System.out.println(ipml.findByStartDateLessarThanOrEqualTo(null));
		System.out.println(System.lineSeparator());
		
		System.out.println(ipml.findByStartDateAndEndDate(null, null));
		 

	}

}
