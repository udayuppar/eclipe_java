package com.uday.curd.war.boot;

import java.time.LocalDateTime;

import com.uday.curd.war.DTO.WarDTO;
import com.uday.curd.war.repository.WarRepository;
import com.uday.curd.war.repository.WarRepositoryImpl;

public class WarRunner {

	public static void main(String[] args) {
		 WarRepository ipml=new WarRepositoryImpl();
		 WarDTO dtos=new WarDTO();
		 dtos.setName("Rusia Ukrain War");
		 dtos.setStartDate(LocalDateTime.of(2022, 03,31,23,30));
		 dtos.setEndDate(LocalDateTime.now());
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
		
		System.out.println(ipml.findByStartDateGreaterThanOrEqualTo(LocalDateTime.of(2000, 10, 31, 00, 00)));
		System.out.println(System.lineSeparator());
		
		System.out.println(ipml.findByStartDateLessarThanOrEqualTo(LocalDateTime.of(2000, 11, 01, 01, 00)));
		System.out.println(System.lineSeparator());
		
		System.out.println(ipml.findByStartDateAndEndDate(LocalDateTime.of(2021, 1, 12, 02, 12), LocalDateTime.now()));
		 

	}

}
