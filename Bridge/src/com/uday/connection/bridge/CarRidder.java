package com.uday.connection.bridge;

import com.uday.connection.rules.Car;

public class CarRidder implements Car {

	public String ownerName() {
		System.out.println("owner Name");
		return null;
	}

	public double price() {
		System.out.println("car price");
		return 0;
	}

	public boolean sequrity() {
		System.out.println("safe or not");
		return false;
	}

	public String name() {
		System.out.println("car name");
		return null;
	}

	public boolean good() {
		System.out.println("good or bad");

		return false;
	}

}
