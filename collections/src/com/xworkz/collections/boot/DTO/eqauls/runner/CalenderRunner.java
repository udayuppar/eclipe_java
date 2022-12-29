package com.xworkz.collections.boot.DTO.eqauls.runner;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.collections.boot.DTO.eqauls.dto.CalenderDTO;

public class CalenderRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CalenderDTO calender1=new CalenderDTO("Mallige", "Kannad", 50D);
		CalenderDTO calender2=new CalenderDTO("Bhagyalaksmi", "Kannad", 100D);
		CalenderDTO calender3=new CalenderDTO("Mallige", "Kannad", 50D);
		CalenderDTO calender4=new CalenderDTO("Gregorian", "english", 51D);
		CalenderDTO calender5=new CalenderDTO("National", "english", 90D);
		
		boolean equals=calender1.equals(calender3);
		System.out.println("there are same :"+equals);
		
		
		Collection<CalenderDTO> dto=new  ArrayList<CalenderDTO>();
		dto.add(calender2);
		dto.add(calender4);
		dto.add(calender5);
		
		 boolean contains=dto.contains(calender3);
		 System.out.println("Contains :"+contains);
		

	}

}
