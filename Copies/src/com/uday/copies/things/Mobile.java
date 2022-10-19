package com.uday.copies.things;

import com.uday.copies.constructerr.Apps;

public class Mobile {
	public String name;
	public String model;
	public int price;
	public boolean working;
	public boolean camara;
	public String[] brands;
	public String[] colour;
	public String[] processor;
	public double[] prices;
	public float[] lenghtInCm;
	public Apps CAMARA;

	public Mobile(String name, String model, int price, boolean working, boolean camara, String[] brands,
			String[] colour, String[] processor, double[] prices, float[] lenghtInCm, Apps CAMARA) {
		this.name = name;
		this.model = model;
		this.price = price;
		this.working = working;
		this.camara = camara;
		this.brands = brands;
		this.colour = colour;
		this.processor = processor;
		this.prices = prices;
		this.lenghtInCm = lenghtInCm;
		this.CAMARA = CAMARA;

	}

	public void print() {
		System.out.println(this.name);
		System.out.println(this.model);
		System.out.println(this.price);
		System.out.println(this.working);
		System.out.println(this.camara);
		System.out.println(this.CAMARA);

		System.out.println("------------------------------------");
		System.out.println("Brands");
		System.out.println("------------------------------------");

		for (int i = 0; i < brands.length; i++) {
			String string = brands[i];
			System.out.println(string);

		}
		System.out.println("------------------------------------");
		System.out.println("defferent colour");
		System.out.println("------------------------------------");

		for (int i = 0; i < colour.length; i++) {
			String string = colour[i];
			System.out.println(string);

		}
		System.out.println("------------------------------------");
		System.out.println("types of processor");
		System.out.println("------------------------------------");

		for (int i = 0; i < processor.length; i++) {
			String string = processor[i];
			System.out.println(string);

		}
		System.out.println("------------------------------------");
		System.out.println("prices");
		System.out.println("------------------------------------");

		for (int i = 0; i < prices.length; i++) {
			double string = prices[i];
			System.out.println(string);

		}
		System.out.println("------------------------------------");
		System.out.println("lenghtInCm");
		System.out.println("------------------------------------");

		for (int i = 0; i < lenghtInCm.length; i++) {
			float string = lenghtInCm[i];
			System.out.println(string);

		}
	}

}
