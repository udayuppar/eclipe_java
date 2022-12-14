package com.uday.curd.pizza.DTO;

import java.time.LocalDateTime;

import com.uday.curd.ipl.dto.AbstractAuditDto;
import com.uday.curd.pizza.pizzaEnum.PizzaSize;


public class PizzaDTO extends AbstractAuditDto{
	private String name;
	private String company;
	private PizzaSize pizza;
	private boolean cheese;
	private double price;
	private String flavour;
	private String  type;
	
	public PizzaDTO() {
		System.out.println("running Default const");
	}

	@Override
	public String toString() {
		return "PizzaDTO [name=" + name + ", company=" + company + ", pizza=" + pizza + ", cheese=" + cheese
				+ ", price=" + price + ", flavour=" + flavour + ", type=" + type + ", toString()=" + super.toString()
				+ "]";
	}

	public PizzaDTO(String name, String company, PizzaSize pizza, boolean cheese, double price, String flavour,
			String type,String createdBy, String updatedBy,LocalDateTime criatedDate,LocalDateTime updatedDate) {
		super();
		this.name = name;
		this.company = company;
		this.pizza = pizza;
		this.cheese = cheese;
		this.price = price;
		this.flavour = flavour;
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public PizzaSize getPizza() {
		return pizza;
	}

	public void setPizza(PizzaSize pizza) {
		this.pizza = pizza;
	}

	public boolean isCheese() {
		return cheese;
	}

	public void setCheese(boolean cheese) {
		this.cheese = cheese;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getFlavour() {
		return flavour;
	}

	public void setFlavour(String flavour) {
		this.flavour = flavour;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	

}
