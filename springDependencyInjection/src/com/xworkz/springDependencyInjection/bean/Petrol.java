package com.xworkz.springDependencyInjection.bean;

import org.springframework.stereotype.Component;

@Component
public class Petrol implements Fuel {
	
	public Petrol() {
		System.out.println("Creating Petrpl in Spring");
	}

	@Override
	public void consume() {
		System.out.println("Creating Consume in SPring");

	}

}
