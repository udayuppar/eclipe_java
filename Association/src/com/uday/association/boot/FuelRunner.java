package com.uday.association.boot;

import com.uday.association.things.Fuel;

public class FuelRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fuel fuel=new Fuel(true, "petrol", 5, 1000);
		fuel.totalPrice();
		fuel.showOff();
	

	}

}
