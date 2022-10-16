package com.uday.copies.boot;

public class Tractor {

	public String name;
	public String brand;
	public double price;
	public String colour;
	public int hp;
	public String model;

	public Tractor() {
		System.out.println("print all the default values");
	}

	public Tractor(String name, String brand) {
		this();
		this.name = name;
		this.brand = brand;
		System.out.println("print the Tractor name and brand");

	}

	public Tractor(String name, String brand, double price) {
		this(name, brand);
		this.price = price;
		System.out.println("print the Tractor name,price, brand");

	}

	public Tractor(String name, String brand, double price, int hp) {
		this("Mahindra", brand, 2000000d);
		this.hp = hp;
		System.out.println("print the Tractor name,price, brand,hp");
	}

	public Tractor(String model, String name, String brand, double price, int hp) {
		this("Sonalika", brand, 5);
		this.model = model;
		System.out.println("print the Tractor name,price, brand,model,hp");
	}

	public Tractor(int hp, String name, String brand) {
		this("Mahindra", brand);
		this.hp = hp;
		System.out.println("print the Tractor name,hp, brand");
	}

}
