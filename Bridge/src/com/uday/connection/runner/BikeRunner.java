package com.uday.connection.runner;

import com.uday.connection.bridge.BikeRidder;
import com.uday.connection.rules.Bike;

public class BikeRunner {

	public static void main(String[] args) {
		Bike bike=new BikeRidder();
		bike.good();
		bike.name();
		bike.ownerName();
		bike.price();
		bike.sequrity();

	}

}
