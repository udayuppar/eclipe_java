package com.uday.encapsulation.things;

public class Perfume {
	private String brand = "Magnet";
	public String fragnence = "dio";
	double price = 250;
	String mfd = "02/11/2022";
	String expd = "02/11/2023";
	String manufacteringCountry = "India";
	char idealFor = 'M';
	int quantity = 50;
	int rating = 5;
	String colour = "block";
	boolean quality = true;

	public String getbrand() {
		return brand;
	}

	void setBrand(String brand) {
		this.brand = brand;
	}

	public void setFragnence(String fragnence) {
		this.fragnence = fragnence;
	}

	void setPrice(double price) {
		this.price = price;
	}

	void setMfd(String mfd) {
		this.mfd = mfd;
	}

	void setExpd(String expd) {
		this.expd = expd;
	}

	void setManufacteringCountry(String manufacteringCountry) {
		this.manufacteringCountry = manufacteringCountry;
	}

	void setIdealFor(char idealFor) {
		this.idealFor = idealFor;
	}

	void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	void setRating(int rating) {
		this.rating = rating;
	}

	void setColour(String colour) {
		this.colour = colour;
	}

	void setQuality(boolean quality) {
		this.quality = quality;
	}

}
