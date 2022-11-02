package com.uday.encapsulation.boot;

import com.uday.encapsulation.things.bike.Bike;
import com.uday.encapsulation.things.bike.BikeModifier;

public class BikeRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bike bike = new Bike();
		System.out.println(bike.getName());
		System.out.println(bike.getColour());

		BikeModifier modi = new BikeModifier();
		modi.useBike(bike);

	}

}
