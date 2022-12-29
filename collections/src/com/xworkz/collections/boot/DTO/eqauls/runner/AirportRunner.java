package com.xworkz.collections.boot.DTO.eqauls.runner;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.collections.boot.DTO.eqauls.dto.AirportDto;

public class AirportRunner {

	public static void main(String[] args) {
		 
		
		AirportDto dto1=new AirportDto("KSR", "Bengalur", "International");
		AirportDto dto2=new AirportDto("Mangalur airport", "Mangalur", "International");
		AirportDto dto3=new AirportDto("Hubli Airport", "Hubli", "domastic");
		AirportDto dto4=new AirportDto("Hubli Airport", "Hubli", "domastic");
		AirportDto dto5=new AirportDto("Shivmogga Airport", "Shivmogga", "domastic");
		
		 boolean equals=dto3.equals(dto4);
		 System.out.println("There two Airport are same:"+equals);
		 
		 Collection<AirportDto> collection=new ArrayList<AirportDto>();
		 collection.add(dto1);
		 collection.add(dto2);
		 collection.add(dto5);
		 
		 
		 boolean contains=collection.contains(dto3);
		 System.out.println("contains:"+contains);
		 
		 
		

	}

}
