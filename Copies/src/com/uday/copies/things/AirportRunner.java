package com.uday.copies.things;

import com.uday.copies.boot.Airport;

public class AirportRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] items = { "IndiGo", "Air India", "SpiceJet", "Go First", "AirAsia India" };
		String[] temp = { "Uday", "Akash", "Ajay", "Sanju" };
		int[] id = { 2585, 6566, 65525, 5664 };
		String[] value = { "Vittal", "tarun", "kiran", "Sachin" };
		long[] no = { 9961539422l, 8861539422l, 7259232100l, 8564254698l };

		Airport airport = new Airport("Kempegowda International Airport", "Bengalur", 10, 500, 20, items, temp, id,
				value, no);
		System.out.println(airport.name);
		System.out.println(airport.place);
		System.out.println(airport.numberOfGates);
		System.out.println(airport.noOfEmploys);
		System.out.println(airport.noOfFligthts);
		System.out.println(airport.flightNames);
		System.out.println(airport.flightDriversNames);
		System.out.println(airport.employId);
		System.out.println(airport.employName);
		System.out.println(airport.helpLineNumber);
		airport.display();

	}

}
