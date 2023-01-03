package com.xworkz.map.dto;

import com.xworkz.map.enums.Type;

public class DataBaseVenderDto {

	private String name;
	private String devolopedBy;
	private Type type;
	private float size;
	private double licenceCost;

	public DataBaseVenderDto() {
		// TODO Auto-generated constructor stub
	}

	public DataBaseVenderDto(String name, String devolopedBy, Type type, float size, double licenceCost) {
		super();
		this.name = name;
		this.devolopedBy = devolopedBy;
		this.type = type;
		this.size = size;
		this.licenceCost = licenceCost;
	}

	@Override
	public String toString() {
		return "DataBaseVenderDto [name=" + name + ", devolopedBy=" + devolopedBy + ", type=" + type + ", size=" + size
				+ ", licenceCost=" + licenceCost + "]";
	}

	@Override
	public int hashCode() {
		System.out.println("Running Hashcode............");
		return 12;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Running equals method..........:" + obj);
		if (obj != null) {
			if (obj instanceof DataBaseVenderDto) {
				DataBaseVenderDto dto = (DataBaseVenderDto) obj;
				if (dto.name.equals(this.name) && dto.devolopedBy.equals(this.devolopedBy)) {
					System.out.println("Name and devolopedBy is matched.. :" + name + devolopedBy);
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

	public String getDevolopedBy() {
		return devolopedBy;
	}

	public void setDevolopedBy(String devolopedBy) {
		this.devolopedBy = devolopedBy;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public float getSize() {
		return size;
	}

	public void setSize(float size) {
		this.size = size;
	}

	public double getLicenceCost() {
		return licenceCost;
	}

	public void setLicenceCost(double licenceCost) {
		this.licenceCost = licenceCost;
	}

}
