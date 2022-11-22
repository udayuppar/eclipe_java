package com.uday.inheritence.things.equality.things;

public class Vehicle {
	private String name;
	private String brand;
	private double price;
	private String ownerName;
	private String model;
	private int weight;
	private boolean quality;
	private String number;
	private String loanOrCash;
	private String location;

	public Vehicle() {
		// TODO Auto-generated constructor stub
	}

	public Vehicle(String name, String brand, double price, String ownerName, String model, int weight, boolean quality,
			String number, String loanOrCash, String location) {
		super();
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.ownerName = ownerName;
		this.model = model;
		this.weight = weight;
		this.quality = quality;
		this.number = number;
		this.loanOrCash = loanOrCash;
		this.location = location;
	}
	
	@Override
	public String toString() {
		return "Vehicle [name=" + name + ", brand=" + brand + ", price=" + price + ", ownerName=" + ownerName
				+ ", model=" + model + ", weight=" + weight + ", quality=" + quality + ", number=" + number
				+ ", loanOrCash=" + loanOrCash + ", location=" + location + "]";
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("eunning equal method in vehicle");
		if (obj instanceof Vehicle) {
			System.out.println("other is vehicle can check the properties");
			Vehicle casted = (Vehicle) obj;
			if (this.brand.equals(casted.brand) || this.name.equals(casted.name)) {
				System.out.println("brand is same and name is same");
				
				return true;

			} else {
				System.err.println("other is not vehicle, cannot check the properties");
			}
		}
		return true;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public boolean isQuality() {
		return quality;
	}

	public void setQuality(boolean quality) {
		this.quality = quality;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getLoanOrCash() {
		return loanOrCash;
	}

	public void setLoanOrCash(String loanOrCash) {
		this.loanOrCash = loanOrCash;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	
	

}
