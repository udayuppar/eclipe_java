package com.xworkz.springDependencyInjection.bean;

import org.springframework.stereotype.Component;

@Component
public class Airtel implements Provider {
	
	public Airtel() {
		System.out.println("Creating Airtel in Spring");
	}

	@Override
	public void connect() {
		System.out.println("Creating connect in Spring");

	}

}
