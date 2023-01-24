package com.xworkz.collections.boot.DTO.eqauls.runner;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import com.xworkz.collections.boot.DTO.eqauls.dto.SweatDto;

public class SweatRunner {

	public static void main(String[] args) {
		 
		
		SweatDto sweat1=new SweatDto("laadu", "Red", 100);
		SweatDto sweat2=new SweatDto("Jamun", "brown", 150);
		SweatDto sweat3=new SweatDto("laadu", "Red", 100);
		
		Collection<SweatDto> set=new HashSet<SweatDto>();
		set.add(sweat1);
		set.add(sweat2);
		set.add(sweat3);
		
		for (SweatDto sweatDto : set) {
			System.out.println(sweatDto);
			sweatDto.hashCode();
			
			
		}

	}

}
