package com.xworkz.collections.boot.DTO.eqauls.dto;

import java.io.Serializable;

public class CalenderDTO implements Serializable {
	private String name;
	private String language;
	private Double price;

	public CalenderDTO() {

	}

	public CalenderDTO(String name, String language, Double price) {
		super();
		this.name = name;
		this.language = language;
		this.price = price;
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("Running equals methods in calender dto");
		
		if(obj!=null) {
			if(obj instanceof CalenderDTO) {
				CalenderDTO dto=(CalenderDTO) obj;
				if(dto.name.equals(this.name)) {
					System.out.println("Name is matched  :"+name);
					return true;
				}
			}
		}
		return true;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	

}
