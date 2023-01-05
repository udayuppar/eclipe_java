package com.xworkz.sorted.dto;

import java.io.Serializable;
import java.time.LocalDate;

import com.xworkz.sorted.enums.Type;

public class WeaponDto implements Serializable,Comparable<WeaponDto>{
	
	private String name;
	private String madeBy;
	private LocalDate madeOn;
	private double price;
	private Type type;
	
	public WeaponDto() {
		// TODO Auto-generated constructor stub
	}

	public WeaponDto(String name, String madeBy, LocalDate madeOn, double price, Type type) {
		super();
		this.name = name;
		this.madeBy = madeBy;
		this.madeOn = madeOn;
		this.price = price;
		this.type = type;
	}

	@Override
	public String toString() {
		return "WeaponDto [name=" + name + ", madeBy=" + madeBy + ", madeOn=" + madeOn + ", price=" + price + ", type="
				+ type + "]";
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 10;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		
		if(obj!=null) {
			if(obj instanceof WeaponDto) {
				WeaponDto casted=(WeaponDto) obj;
				if(casted.name.equals(this.name) && casted.price==(this.price)) {
					return true;
				}
			}
		}
		return false;
	}
	
	@Override
	public int compareTo(WeaponDto o) {
		// TODO Auto-generated method stub
		//return this.name.compareTo(o.name);
		return o.name.compareToIgnoreCase(this.name);
		 
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMadeBy() {
		return madeBy;
	}

	public void setMadeBy(String madeBy) {
		this.madeBy = madeBy;
	}

	public LocalDate getMadeOn() {
		return madeOn;
	}

	public void setMadeOn(LocalDate madeOn) {
		this.madeOn = madeOn;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}
	
	

}
