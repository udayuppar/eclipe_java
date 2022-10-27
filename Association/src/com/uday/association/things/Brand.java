package com.uday.association.things;

public class Brand {
	public String name;
	public long gstNumber;
	public int rating;
	public Location location = new Location("Dubai", 25, "uday");

	public Brand(String name, long gstNumber, int rating) {
		this.name = name;
		this.gstNumber = gstNumber;
		this.rating = rating;
	}

	public void showOff() {
		System.out.println("customer data type brand");
		System.out.println("Brand name:" + name);
		System.out.println("GST number:" + gstNumber);
		System.out.println("Rating:" + rating);
		System.out.println("****************************");
	}
		
		public void display() {
		if (location != null) {
			this.location.locationName = "Arab";
			this.location.noOfWorkers = 50;
			this.location.ownerName = "Uday";

		} else {
			System.out.println("invoking exist");
		}
		System.out.println("location Name:" + location.locationName);
		System.out.println("no Of Workers:" + location.noOfWorkers);
		System.out.println("owner Name:" + location.ownerName);
	}

}
