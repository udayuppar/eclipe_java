package com.uday.copies.boot;

public class Chain {

	public String type;
	public int price;
	public float lengthInFeet;
	public String material;
	public float weight;
	public boolean usedFor;
	public boolean fresher;

	public Chain() {
		System.out.println("print all default values");
	}

	public Chain(String type, int price) {
		this();
		this.type = type;
		this.price = price;
		System.out.println("Print the chain type and price");
	}

	public Chain(String type, int price, float lengthInFeet) {
		this("Round", 500);
		this.lengthInFeet = lengthInFeet;

		System.out.println("Print the chain type, price and length");
	}

	public Chain(String type, int price, float lengthInFeet, String material) {
		this("Round", 500, 1);
		this.material = material;

		System.out.println("Print the chain type, price, length and material");
	}

	public Chain(String type, int price, float lengthInFeet, String material, float weight) {
		this("Round", 500, 1, "Cast Iron");
		this.weight = weight;

		System.out.println("Print the chain type, price, length, material and weight");
	}

	public Chain(String type, int price, float lengthInFeet, String material, float weight, boolean usedFor) {
		this("Round", 500, 1, "Cast Iron", 2);
		this.usedFor = usedFor;

		System.out.println("Print the chain type, price, length, material,weight and uesdfor");
	}

	public Chain(String type, int price, float lengthInFeet, String material, float weight, boolean usedFor,
			boolean fresher) {
		this("Round", 500, 1, "Cast Iron", 2, true);
		this.fresher = fresher;

		System.out.println("Print the chain type, price, length, material,weight and uesdfor");
	}

}
