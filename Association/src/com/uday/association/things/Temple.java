package com.uday.association.things;

public class Temple {
	public String name;
	public String mainPriest;
	public int noOfVisitors;
	public double collectionPerDay;
	public God god = new God("Anjaneya", "male", "blessing");

	public Temple(String name, String mainPriest, int noOfVisitors, double collectionPerDay) {
		this.name = name;
		this.mainPriest = mainPriest;
		this.noOfVisitors = noOfVisitors;
		this.collectionPerDay = collectionPerDay;
	}

	public void showOff() {
		System.out.println("temple name:" + name);
		System.out.println("mainPriest:" + mainPriest);
		System.out.println("no Of Visitors:" + noOfVisitors);
		System.out.println("collection Per Day:" + collectionPerDay);
		System.out.println("************************");
		if (god != null) {
			this.god.name = god.name;
			this.god.gender = god.gender;
			this.god.mainPower = god.mainPower;
		} else {
			System.out.println("exist");
		}
		System.out.println("------------------------------");
		System.out.println("--------------display the god detailse----------------------");
		god.display();
	}

}
