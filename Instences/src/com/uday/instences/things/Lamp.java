package com.uday.instences.things;

public class Lamp {
	public final double price = 500;
	public static String brand;
	public int quantity;
	public String name;
	public boolean working = true;

	static {
		Lamp.brand = "Marset";
	}

	public void setLamp() {
		this.quantity =15;
	}

	public Lamp(String name) {
		this.name = "Arc Lamps";
	}

	public void display() {
		System.out.println(this.price);
		System.out.println(Lamp.brand);
		System.out.println(this.quantity);
		System.out.println(this.name);
		System.out.println(this.working);
	}
}
