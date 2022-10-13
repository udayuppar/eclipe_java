package com.uday.copies.boot;

public class Boat {

	public String name;
	public String colour;
	public int price;
	public char size;
	public float wieghtInGrams;

	public Boat() {
		System.out.println("pointing to default values");

	}

	public Boat(String name) {
		this.name = name;
		System.out.println("default value pointing to instance memory");
	}

	public Boat(char size) {
		this.size = size;
		System.out.println("default value pointing to instance memory");
	}

	public Boat(int price) {
		this.price = price;

		System.out.println("default value pointing to instance memory");
	}

	public Boat(float wieghtInGrams) {
		this.wieghtInGrams = wieghtInGrams;

		System.out.println("default value pointing to instance memory");
	}

	public Boat(String name, int price) {
		this.name = name;
		this.price = price;
		System.out.println("default value pointing to instance memory");
	}

	public Boat(String name, float wieghtInGrams) {
		this.name = name;
		this.wieghtInGrams = wieghtInGrams;
		System.out.println("default value pointing to instance memory");
	}

	public Boat(int price, char size) {
		this.price = price;
		this.size = size;
		System.out.println("default value pointing to instance memory");
	}

}
