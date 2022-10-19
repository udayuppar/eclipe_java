package com.uday.copies.things;

public class Laptop {
	public String name;
	public String owenName;
	public boolean graphicsCard;
	public double price;
	public float weightInKg;
	public String[] brands;
	public String[] colours;
	public int[] storage;
	public String[] processors;
	public double[] pricess;

	public Laptop(String name, String owenName, boolean graphicsCard, double price, float weightInKg, String[] brands,
			String[] colours, int[] storage, String[] processors, double[] pricess) {
		this.name = name;
		this.owenName = owenName;
		this.graphicsCard = graphicsCard;
		this.price = price;
		this.weightInKg = weightInKg;
		this.brands = brands;
		this.colours = colours;
		this.storage = storage;
		this.processors = processors;
		this.pricess = pricess;

	}

	public void print() {
		System.out.println(this.name);
		System.out.println(this.owenName);
		System.out.println(this.graphicsCard);
		System.out.println(this.price);
		System.out.println(this.weightInKg);
		System.out.println("************************************");
		System.out.println("type of brands");
		System.out.println("************************************");

		for (int i = 0; i < brands.length; i++) {
			String string = brands[i];
			System.out.println(string);

		}
		System.out.println("************************************");

		System.out.println("different colour");
		System.out.println("************************************");

		for (int i = 0; i < colours.length; i++) {
			String string = colours[i];
			System.out.println(string);

		}
		System.out.println("************************************");

		System.out.println("Storage");
		System.out.println("************************************");

		for (int i = 0; i < storage.length; i++) {
			int string = storage[i];
			System.out.println(string);

		}
		System.out.println("************************************");

		System.out.println("different type of processor");
		System.out.println("************************************");

		for (int i = 0; i < processors.length; i++) {
			String string = processors[i];
			System.out.println(string);

		}
		System.out.println("************************************");

		System.out.println("pricess");
		System.out.println("************************************");

		for (int i = 0; i < pricess.length; i++) {
			double string = pricess[i];
			System.out.println(string);

		}
	}
}
