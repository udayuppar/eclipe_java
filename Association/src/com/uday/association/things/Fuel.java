package com.uday.association.things;

public class Fuel {
	public boolean special;
	public String type;
	public int quantity;
	public double price;
	public Brand brand = new Brand("HP", 1254698745l, 5);
	

	public Fuel(boolean special, String type, int quantity, double price) {
		this.special = special;
		this.type = type;
		this.quantity = quantity;
		this.price = price;
	}

	public void totalPrice() {
		double totalPrice = price * quantity;
		System.out.println("print the total price");
		System.out.println(totalPrice);
		System.out.println("*********************************");
		
	}

	public void showOff() {
		System.out.println("special fuel:" + special);
		System.out.println("fuel type:" + type);
		System.out.println("fuel quantity:" + quantity);
		System.out.println("fuel price:" + price);
		System.out.println("****************************");
		if (brand != null) {
			this.brand.name = "Indian";
			this.brand.gstNumber = 1345789l;
			this.brand.rating = 10;
		} else {
			System.out.println("invoking exist");
		}
		System.out.println("customer data type brand");
		System.out.println("brand name:" + brand.name);
		System.out.println("gst Number:" + brand.gstNumber);
		System.out.println(" rating:" + brand.rating);
		System.out.println("******************************");
		brand.display();
		System.out.println("----------ending ------------");
		
		
	}

}
