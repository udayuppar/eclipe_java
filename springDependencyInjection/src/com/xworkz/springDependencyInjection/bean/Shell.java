package com.xworkz.springDependencyInjection.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Shell implements PetrolBunk {
	
	@Autowired
	@Qualifier("petrol")
	private Fuel fuel;
	
	
	public Shell() {
		System.out.println("Creating Shell default const");
	}

	@Override
	public void purchase() {
		System.out.println("Creating purchase method");

	}

}
