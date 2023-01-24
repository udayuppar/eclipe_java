package com.uday.association.things.person;

public class Country {
	public String name;
	public String capital;
	public long   population;
	public String presidentName;
	
	
	public Country(String name, String capital, long population, String presidentName) {
		super();
		this.name = name;
		this.capital = capital;
		this.population = population;
		this.presidentName = presidentName;
	}
	public void charge()
	{
		System.out.println(name);
		System.out.println(capital);
		System.out.println(population);
		System.out.println(presidentName);
	}
	

}
