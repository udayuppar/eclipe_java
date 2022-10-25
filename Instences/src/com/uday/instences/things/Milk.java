package com.uday.instences.things;

public class Milk {

	public final String brand = "Nandini";
	public static int price;
	public int quantity;
	public int expairyDate;
	public boolean good = true;

	static {
		Milk.price = 25;

	}

	public Milk(int quantity) {
		this.quantity = 10;
	}

	public void setMilk() {
		this.expairyDate = 2;
	}

	public void display() {
		System.out.println(this.brand);
		System.out.println(Milk.price);
		System.out.println(this.quantity);
		System.out.println(this.expairyDate);
		System.out.println(this.good);
	}

}
