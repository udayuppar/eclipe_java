package com.xworkz.collections.boot.DTO;

import java.io.Serializable;

public class SanitizerDTO implements Serializable {

	private int id;
	private String name;
	private String colour;
	private double price;

	public SanitizerDTO() {
		System.out.println("Default const running");
	}

	public SanitizerDTO(int id, String name, String colour, double price) {
		super();
		this.id = id;
		this.name = name;
		this.colour = colour;
		this.price = price;
	}

	@Override
	public String toString() {
		return "SanitizerDTO [id=" + id + ", name=" + name + ", colour=" + colour + ", price=" + price + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
