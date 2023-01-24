package com.xworkz.collections.boot.DTO.eqauls.dto;

import java.io.Serializable;

public class SweatDto implements Serializable {

	private String name;
	private String colour;
	private double price;

	public SweatDto() {
		// TODO Auto-generated constructor stub
	}

	public SweatDto(String name, String colour, double price) {
		super();
		this.name = name;
		this.colour = colour;
		this.price = price;
	}

	@Override
	public String toString() {
		return "SweatDto [name=" + name + ", colour=" + colour + ", price=" + price + ", hashCode()=" + hashCode()
				+ "]";
	}

	@Override
	public int hashCode() {
		System.out.println("Running hashcode method");
		return 30;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Running equals method");
		if (obj != null) {
			if (obj instanceof SweatDto) {
				SweatDto dto = (SweatDto) obj;
				if (dto.name.equals(this.name) && dto.price == this.price) {
					System.out.println("name and price is matched :" + dto);
					return true;
				}
			}
		}
		return false;
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
