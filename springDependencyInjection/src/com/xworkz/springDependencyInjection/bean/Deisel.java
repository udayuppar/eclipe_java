package com.xworkz.springDependencyInjection.bean;

import org.springframework.stereotype.Component;

@Component
public class Deisel implements Fuel {

	public Deisel() {
		System.out.println(" Create Deisel in Const ");
	}

	@Override
	public void consume() {
		System.out.println("Creating Consume in Spring");

	}

}
