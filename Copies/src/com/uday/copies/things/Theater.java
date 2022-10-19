package com.uday.copies.things;

import com.uday.copies.constructerr.SeatType;

public class Theater {
	public String name;
	public String location;
	public String owerName;
	public int capacity;
	public boolean ac;
	public String[] filmsName;
	public int[] ticketPrice;
	public int[] noOfScreens;
	public String[] lungauges;
	public String[] effects;
	public SeatType GOLD;

	public Theater(String name, String location, String owerName, int capacity, boolean ac, String[] filmsName,
			int[] ticketPrice, int[] noOfScreens, String[] lungauges, String[] effects, SeatType GOLD)

	{
		this.name = name;
		this.location = location;
		this.owerName = owerName;
		this.capacity = capacity;
		this.ac = ac;
		this.filmsName = filmsName;
		this.ticketPrice = ticketPrice;
		this.noOfScreens = noOfScreens;
		this.lungauges = lungauges;
		this.effects = effects;
		this.GOLD = GOLD;
	}

	public void print() {
		System.out.println(this.name);
		System.out.println(this.location);
		System.out.println(this.owerName);
		System.out.println(this.capacity);
		System.out.println(this.ac);
		System.out.println(this.GOLD);
		System.out.println("*********************************");
		System.out.println("filmsNames");
		System.out.println("*********************************");

		for (int i = 0; i < filmsName.length; i++) {
			String string = filmsName[i];
			System.out.println(string);

		}
		System.out.println("*********************************");
		System.out.println("ticketPrice");
		System.out.println("*********************************");

		for (int i = 0; i < ticketPrice.length; i++) {
			int string = ticketPrice[i];
			System.out.println(string);

		}
		System.out.println("*********************************");
		System.out.println("noOfScreens");
		System.out.println("*********************************");

		for (int i = 0; i < noOfScreens.length; i++) {
			int string = noOfScreens[i];
			System.out.println(string);

		}
		System.out.println("*********************************");
		System.out.println("lungauges");
		System.out.println("*********************************");

		for (int i = 0; i < lungauges.length; i++) {
			String string = lungauges[i];
			System.out.println(string);

		}
		System.out.println("*********************************");
		System.out.println("effects");
		System.out.println("*********************************");

		for (int i = 0; i < effects.length; i++) {
			String string = effects[i];
			System.out.println(string);

		}

	}
}
