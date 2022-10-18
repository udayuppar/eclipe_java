package com.uday.copies.boot;

public class Airport {
	public String name;
	public String place;
	public int numberOfGates;
	public int noOfEmploys;
	public int noOfFligthts;
	public String[] flightNames;
	public String[] flightDriversNames;
	public int[] employId;
	public String[] employName;
	public long[] helpLineNumber;

	public Airport(String name, String place, int numberOfGates, int noOfEmploys, int noOfFligthts,
			String[] flightNames, String[] flightDriversNames, int[] employId, String[] employName,
			long[] helpLineNumber) {
		this.name = name;
		this.place = place;
		this.numberOfGates = numberOfGates;
		this.noOfEmploys = noOfEmploys;
		this.noOfFligthts = noOfFligthts;
		this.flightNames = flightNames;
		this.flightDriversNames = flightDriversNames;
		this.employId = employId;
		this.employName = employName;
		this.helpLineNumber = helpLineNumber;
	}

	public void display() {
		System.out.println(this.name);
		System.out.println(this.place);
		System.out.println(this.numberOfGates);
		System.out.println(this.noOfEmploys);
		System.out.println(this.noOfFligthts);
		System.out.println("**************************************");
		System.out.println("Flight names");
		System.out.println("**************************************");
		for (int i = 0; i < flightNames.length; i++) {
			String j = flightNames[i];
			System.out.println(j);

		}
		System.out.println("**************************************");
		System.out.println("Flight Drivers names");
		System.out.println("**************************************");
		for (int i = 0; i < flightDriversNames.length; i++) {
			String j = flightDriversNames[i];
			System.out.println(j);

		}
		System.out.println("**************************************");
		System.out.println("Employ id");
		System.out.println("**************************************");
		for (int i = 0; i < employId.length; i++) {
			int j = employId[i];
			System.out.println(j);

		}
		System.out.println("**************************************");
		System.out.println("Employ names");
		System.out.println("**************************************");
		for (int i = 0; i < employName.length; i++) {
			String j = employName[i];
			System.out.println(j);

		}
		System.out.println("**************************************");
		System.out.println("Helpline numbers");
		System.out.println("**************************************");
		for (int i = 0; i < helpLineNumber.length; i++) {
			long j = helpLineNumber[i];
			System.out.println(j);

		}
	}

}
