package com.uday.copies.things;

import com.uday.copies.boot.Boat;

public class BoatRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Boat boat = new Boat();
		System.out.println(boat.colour);
		System.out.println(boat.name);
		System.out.println(boat.price);
		System.out.println(boat.size);
		System.out.println(boat.wieghtInGrams);
		System.out.println("*************************************");

		Boat boat2 = new Boat("BOAT");
		System.out.println(boat2.colour);
		System.out.println(boat2.name);
		System.out.println(boat2.price);
		System.out.println(boat2.size);
		System.out.println(boat2.wieghtInGrams);
		System.out.println("*************************************");

		Boat boat3 = new Boat('M');
		System.out.println(boat3.colour);
		System.out.println(boat3.name);
		System.out.println(boat3.price);
		System.out.println(boat3.size);
		System.out.println(boat3.wieghtInGrams);
		System.out.println("*************************************");

		Boat boat4 = new Boat(2000);
		System.out.println(boat4.colour);
		System.out.println(boat4.name);
		System.out.println(boat4.price);
		System.out.println(boat4.size);
		System.out.println(boat4.wieghtInGrams);
		System.out.println("*************************************");

		Boat boat5 = new Boat(250);
		System.out.println(boat5.colour);
		System.out.println(boat5.name);
		System.out.println(boat5.price);
		System.out.println(boat5.size);
		System.out.println(boat5.wieghtInGrams);
		System.out.println("*************************************");

		Boat boat6 = new Boat("BOAT", 3000);
		System.out.println(boat6.colour);
		System.out.println(boat6.name);
		System.out.println(boat6.price);
		System.out.println(boat6.size);
		System.out.println(boat6.wieghtInGrams);
		System.out.println("*************************************");

		Boat boat7 = new Boat("BOAT", 250);
		System.out.println(boat7.colour);
		System.out.println(boat7.name);
		System.out.println(boat7.price);
		System.out.println(boat7.size);
		System.out.println(boat7.wieghtInGrams);
		System.out.println("*************************************");

		Boat boat8 = new Boat(3000, 'M');
		System.out.println(boat8.colour);
		System.out.println(boat8.name);
		System.out.println(boat8.price);
		System.out.println(boat8.size);
		System.out.println(boat8.wieghtInGrams);
		System.out.println("*************************************");

	}

}
