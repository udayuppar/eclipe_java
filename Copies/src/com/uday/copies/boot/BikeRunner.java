package com.uday.copies.boot;

import com.uday.copies.things.Bike;

public class BikeRunner {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] item = { "Pulser 120", "Pulser 150", "Pulser 180", "Pulser 220" };
		String[] temp = { "Block", "Red", "Green", "Blue" };
		double[] cost = { 50000, 60000, 90000, 80000 };
		String[] value = { "MRF", "CEAT", "JK teir", "TVS" };

		Bike bike = new Bike("Pulser", "Uday", false, false, 60, 4, item, temp, cost, value);
		bike.print();

	}

}
