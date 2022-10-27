package com.uday.association.things;

public class Company {

	public String name;
	public String type;

	public Company(String name, String type) {
		this.name = name;
		this.type = type;
	}

	public void showOff() {
		System.out.println("Company name" + name);
		System.out.println("Company type" + type);
	}

}
