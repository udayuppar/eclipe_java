package com.uday.encapsulation.things.car;

public class Car {
	private String owerName = "Uday";
	private String colour = "block";
	String name = "BMW";
	int wightInKg = 250;
	String brand = "BMW";
	double price = 900000;
	int millage = 12;
	String model = "BMW x6";
	double fuelTankCapacity = 50;
	String deliveryDate = "02/10/2022";
	int noOfTyre = 5;

	public String getOwerName() {
		return owerName;
	}

	public String getColour() {
		return colour;
	}

	void setOwerName(String owerName) {
		this.owerName = owerName;
	}

	void setColour(String colour) {
		this.colour = colour;
	}

	void setName(String name) {
		this.name = name;
	}

	void setWightInKg(int wightInKg) {
		this.wightInKg = wightInKg;
	}

	void setbrand(String brand) {
		this.brand = brand;
	}

	void setPrice(double price) { 
		this.price = price;
	}

	void setMillage(int millage) {
		this.millage = millage;
	}

	void setModel(String model) {
		this.model = model;
	}

	void setFuelTankCapacity(double fuelTankCapacity) {
		this.fuelTankCapacity = fuelTankCapacity;
	}

	void setDeliveryDate(String deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	void setNoOfTyre(int noOfTyre) {
		this.noOfTyre = noOfTyre;
	}

}
