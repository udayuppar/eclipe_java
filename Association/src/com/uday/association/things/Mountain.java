package com.uday.association.things;

public class Mountain {
	public String name;
	public float height;
	public MountainLocation location = new MountainLocation("Meditation Lane", "kasmir", "jammu kashmir", "india",
			577228l);
	public Temple temple = new Temple("Anjanadry", "helping people", 500, 10000);

	public Mountain(String name, float height) {
		this.name = name;
		this.height = height;

	}

	public void showOff() {
		System.out.println("Start invoking into the method");
		System.out.println("Mountain name:" + name);
		System.out.println("Mountain height:" + height);
		System.out.println("*****************************");
		if (location != null) {
			this.location.street = location.street;
			this.location.city = location.city;
			this.location.state = location.state;
			this.location.country = location.country;
			this.location.pincode = location.pincode;
		} else {
			System.out.println("invoking exist");
		}
		System.out.println("---------------Print the location of the mountain------------- ");
		location.showOff();
		System.out.println("------------------------------------------");
	}

	public void display() {
		if (temple != null) {
			this.temple.name = temple.name;
			this.temple.mainPriest = temple.mainPriest;
			this.temple.noOfVisitors = temple.noOfVisitors;
			this.temple.collectionPerDay = temple.collectionPerDay;
		}
		System.out.println("--------------Disply the temple  detailse-------------------");
		temple.showOff();
	}
}
