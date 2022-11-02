package com.uday.encapsulation.things.bike;

public class Bike {
	private String name = "classic 350";
	private String colour = "block";
	String owerName="Uday";
	int wightInKg=250;
	String brand="Royal enfield";
	double price=350000;
	int millage=35;
	String model="BS6";
	double fuelTankCapacity=20;
	String deliveryDate="02/11/2022";
	int noOfTyre=2;

	public String getName() {
		return name;
	}

	public String getColour() {
		return colour;
	}

	void setName(String name) {
		this.name = name;
	}

	void setColour(String colour) {
		this.colour = colour;
	}

	void setOwerName(String owerName) {
		this.owerName = owerName;
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
