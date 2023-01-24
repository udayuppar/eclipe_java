package com.xworkz.example.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Example {
	
	@Autowired
	@Qualifier("name")
	private String name;
	@Autowired
	@Qualifier("price")
	private Double price;
	
	@Autowired
	@Qualifier("bikeName")
	private Bike bike;
	
	public Example() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Example [name=" + name + ", price=" + price + ",bike=" + bike + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	public Bike getBike() {
		return bike;
	}

	public void setBike(Bike bike) {
		this.bike = bike;
	}

	
	
	

}
