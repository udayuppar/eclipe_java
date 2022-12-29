package com.xworkz.collections.boot.DTO;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class SanitizerDTORunner {

	public static void main(String[] args) {
		
		
		SanitizerDTO dto1=new SanitizerDTO(101, "Himalaya", "white", 500);
		SanitizerDTO dto2=new SanitizerDTO(102, "Sterillium", "red", 600);
		SanitizerDTO dto3=new SanitizerDTO(103, "Savlon", "blue", 250);
		SanitizerDTO dto4=new SanitizerDTO(104, "Dettol", "grean", 100);
		SanitizerDTO dto5=new SanitizerDTO(105, "Lifebuoy", "White", 60);
		SanitizerDTO dto6=new SanitizerDTO(106, "Godrej", "yellwo", 301);
		SanitizerDTO dto7=new SanitizerDTO(107, "Dabur", "sky blue", 257);
		SanitizerDTO dto8=new SanitizerDTO(108, "Multani", "White", 614);
		SanitizerDTO dto9=new SanitizerDTO(109, "Corvil", "orange", 278);
		SanitizerDTO dto10=new SanitizerDTO(110, "Trust", "pink", 151);
		
		Collection<SanitizerDTO> collection= new ArrayList<SanitizerDTO>();
		collection.add(dto1);
		collection.add(dto2);
		collection.add(dto3);
		collection.add(dto4);
		collection.add(dto5);
		collection.add(dto6);
		collection.add(dto7);
		collection.add(dto8);
		collection.add(dto9);
		collection.add(dto10);
		
		
		Iterator<SanitizerDTO> sanitizer=collection.iterator();
		while(sanitizer.hasNext()) {
			SanitizerDTO dto=sanitizer.next();
			System.out.println(dto);
			if(dto.getPrice()>=50) {
				System.out.println("The prize is Greater than 50");
			}
			else {
				System.err.println("The prize is less than 50");
			}
			
		
		}
		
		System.out.println(System.lineSeparator());
		System.out.println("-----------sanitizer property is pointing null or not----------");
	
		Iterator<SanitizerDTO> sanitizer1=collection.iterator();
		while(sanitizer1.hasNext()) {
			SanitizerDTO dto=sanitizer1.next();
			if(dto.getColour()==null || dto.getName()==null) {
				System.out.println("the property is pointing to null");
			}else {
				System.err.println("the property is not pointing to null");
			}
			

		}
		System.out.println(System.lineSeparator());
		System.out.println("-----------Remove method----------");
		
		Iterator<SanitizerDTO> sanitizer2=collection.iterator();
		while(sanitizer2.hasNext()) {
			SanitizerDTO dto=sanitizer2.next();
			if(dto.getColour()=="blue" || dto.getColour()=="red" || dto.getColour()=="grean") {
				System.out.println("Element getting revomed:"+dto);
				sanitizer2.remove();
			}
	}
		
		System.out.println(System.lineSeparator());
		System.out.println("-----------max price----------");
		
		Iterator<SanitizerDTO> sanitizer3=collection.iterator();
		while(sanitizer3.hasNext()) {
			SanitizerDTO list=sanitizer3.next();
			if(list.getPrice()> 600) {
				System.out.println("sanitizer max price: "+list);
				
			}
	}
		System.out.println(System.lineSeparator());
		System.out.println("----------- second max price----------");
		
		Iterator<SanitizerDTO> sanitizer4=collection.iterator();
		while(sanitizer4.hasNext()) {
			SanitizerDTO list=sanitizer4.next();
			if(list.getPrice()> 500) {
				System.out.println("sanitizer max price: "+list);
				
			}
	}
	}
}
