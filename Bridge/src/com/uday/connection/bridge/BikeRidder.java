package com.uday.connection.bridge;

import com.uday.connection.rules.Bike;

public class BikeRidder implements Bike {

	public String ownerName() {
		System.out.println("owner Name");
		return null;
	}

	public double price() {
		System.out.println("bike price");
		return 0;
	}

	public boolean sequrity() {
		System.out.println("safe or not");
		return false;
	}

	public String name() {
		System.out.println("bike name");
		return null;
	}

	public boolean good() {
		System.out.println("good or bad");

		return false;
	}

}
