package com.xworkz.springInitialisation.things;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component

public class Rocket {

	@Value("India")
	private String country;
	@Value("Vikram-S rocket")
	private String name;
	@Value("1000000d")
	private double budget;

	public Rocket() {
		System.out.println("Registering Rocket in default  const");
	}

	public String getName() {
		System.out.println("Registering name in Spring");

		return name;
	}

	public double getBudget() {
		System.out.println("Registering name in Budget");
		return budget;
	}

	public String getCountry() {
		System.out.println("Registering name in Country");
		return country;
	}

}
