package com.uday.copies.boot;

public class Bread {

	public String type;
	public String shape;
	public int price;
	public char quantity;
	public String companyName;

	public Bread() {
		System.out.println("print on default value");
	}

	public Bread(String type) {
		this.type = type;
		System.out.println("variable value pointing to instants memory");
	}

	public Bread(int price) {
		this.price = price;
		System.out.println("variable value pointing to instants memory");
	}

	public Bread(char quantity) {
		this.quantity = quantity;
		System.out.println("variable value pointing to instants memory");
	}

	public Bread(String type, String shape)

	{
		this.type = type;
		this.shape = shape;
		System.out.println("variable value pointing to instants memory");
	}

	public Bread(String type, int price)

	{
		this.type = type;
		this.price = price;
		System.out.println("variable value pointing to instants memory");
	}

	public Bread(String type, char quantity)

	{
		this.type = type;
		this.quantity = quantity;
		System.out.println("variable value pointing to instants memory");
	}

	public Bread(int price, String shape)

	{
		this.price = price;
		this.shape = shape;
		System.out.println("variable value pointing to instants memory");
	}

}
