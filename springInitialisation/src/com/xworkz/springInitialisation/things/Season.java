package com.xworkz.springInitialisation.things;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


public class Season {
	@Value("Winter")
	private String name;
	@Value("4")
	private int durationInMounth;
	@Value("November")
	private String startingMounth;

	public Season() {
		System.out.println("Registering default season const");
	}

	public void setName(String name) {
		System.out.println("Registering name in Spring");
		this.name = name;
	}

	public void setDurationInMounth(int durationInMounth) {
		System.out.println("Registering Number of Mounth in Spring");
		this.durationInMounth = durationInMounth;
	}

	public void setStartingMounth(String startingMounth) {
		System.out.println("Registering Starting mounth in Spring");
		this.startingMounth = startingMounth;
	}

	public String getName() {
		return name;
	}

	public int getDurationInMounth() {
		return durationInMounth;
	}

	public String getStartingMounth() {
		return startingMounth;
	}

}
