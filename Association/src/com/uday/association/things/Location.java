package com.uday.association.things;

public class Location {
	public String locationName;
	public int noOfWorkers;
	public String ownerName;

	public Location(String locationName, int noOfWorkers, String ownerName) {
		this.locationName = locationName;
		this.noOfWorkers = noOfWorkers;
		this.ownerName = ownerName;
	}

	public void display() {
		System.out.println("location Name:" + locationName);
		System.out.println("no Of Workers :" + noOfWorkers);
		System.out.println("owner Name:" + ownerName);
	}

}
