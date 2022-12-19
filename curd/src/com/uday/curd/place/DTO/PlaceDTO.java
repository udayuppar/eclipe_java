package com.uday.curd.place.DTO;

public class PlaceDTO extends AbstractAditDto {

	private String name;
	private int noOfTaluk;
	private FamousFor place;
	private double population;

	public PlaceDTO() {
		System.out.println("Running place default const");
	}

	public PlaceDTO(String name, int noOfTaluk, FamousFor place, double population) {
		super();
		this.name = name;
		this.noOfTaluk = noOfTaluk;
		this.place = place;
		this.population = population;
	}

	@Override
	public String toString() {
		return "PlaceDTO [name=" + name + ", noOfTaluk=" + noOfTaluk + ", place=" + place + ", population=" + population
				+ ", toString()=" + super.toString() + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNoOfTaluk() {
		return noOfTaluk;
	}

	public void setNoOfTaluk(int noOfTaluk) {
		this.noOfTaluk = noOfTaluk;
	}

	public FamousFor getPlace() {
		return place;
	}

	public void setPlace(FamousFor place) {
		this.place = place;
	}

	public double getPopulation() {
		return population;
	}

	public void setPopulation(double population) {
		this.population = population;
	}

}
