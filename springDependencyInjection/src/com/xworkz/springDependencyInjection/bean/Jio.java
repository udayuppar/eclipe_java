package com.xworkz.springDependencyInjection.bean;

import org.springframework.stereotype.Component;

@Component
public class Jio implements Provider {
	
	public Jio() {
		System.out.println("Creating Jio in Spring");
	}

	@Override
	public void connect() {
		System.out.println("Creating connect in spring");

	}

}
