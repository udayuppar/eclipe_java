package com.xworkz.curd.boot;

import com.xworkz.curd.dto.TerroristDto;
import com.xworkz.curd.survice.TerroristSurvice;
import com.xworkz.curd.survice.TerroristSurviceImpl;

public class TerroristRunner {

	public static void main(String[] args) {
		
		TerroristDto dto=new TerroristDto();
		dto.setName("Umar Faruk");
		System.out.println(dto);
		
		TerroristSurvice survice=new TerroristSurviceImpl();
		survice.validateAndSave(dto);
		

	}

}
