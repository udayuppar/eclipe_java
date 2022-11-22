package com.uday.inheritence.things.equality.things;

public class WaterBottel {
	private String name;
	private String brand;
	private double price;
	private String ownerName;
	private String model;
	private int weight;
	private boolean quality;
	private boolean quantityInLit;
	private int heightInInch;
	private String hotOrCold;

	public WaterBottel() {
		// TODO Auto-generated constructor stub
	}

	public WaterBottel(String name, String brand, double price, String ownerName, String model, int weight,
			boolean quality, boolean quantityInLit, int heightInInch, String hotOrCold) {
		super();
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.ownerName = ownerName;
		this.model = model;
		this.weight = weight;
		this.quality = quality;
		this.quantityInLit = quantityInLit;
		this.heightInInch = heightInInch;
		this.hotOrCold = hotOrCold;
	}
	@Override
	public String toString() {
		return "WaterBottel [name=" + name + ", brand=" + brand + ", price=" + price + ", ownerName=" + ownerName
				+ ", model=" + model + ", weight=" + weight + ", quality=" + quality + ", quantityInLit="
				+ quantityInLit + ", heightInInch=" + heightInInch + ", hotOrCold=" + hotOrCold + "]";
	}
	@Override
	public boolean equals(Object obj) {
		System.out.println("eunning equal method in waterbottel");
		if (obj instanceof WaterBottel) {
			System.out.println("other is water bottel can check the properties");
			WaterBottel casted = (WaterBottel) obj;
			if (this.brand.equals(casted.brand) || this.name.equals(casted.name) || this.model.equals(casted.model)) {
				System.out.println("brand is same and name is same");
				
				return true;

			} else {
				System.err.println("other is not water botel, cannot check the properties");
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

	public boolean isQuantityInLit() {
		return quantityInLit;
	}

	public void setQuantityInLit(boolean quantityInLit) {
		this.quantityInLit = quantityInLit;
	}

	public int getHeightInInch() {
		return heightInInch;
	}

	public void setHeightInInch(int heightInInch) {
		this.heightInInch = heightInInch;
	}

	public String getHotOrCold() {
		return hotOrCold;
	}

	public void setHotOrCold(String hotOrCold) {
		this.hotOrCold = hotOrCold;
	}

	
	

}
