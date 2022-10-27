package com.uday.association.things;

public class MountainLocation {

	public String street;
	public String city;
	public String state;
	public String country;
	public long pincode;

	public MountainLocation(String street, String city, String state, String country, long pincode) {
		this.street = street;
		this.city = city;
		this.state = state;
		this.country = country;
		this.pincode = pincode;

	}

	public void showOff() {
		System.out.println("street name:" + street);
		System.out.println("city name:" + city);
		System.out.println("state name:" + state);
		System.out.println("country name:" + country);
		System.out.println("pincode:" + pincode);
	}
}
