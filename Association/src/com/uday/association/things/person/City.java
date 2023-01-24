package com.uday.association.things.person;

public class City {
	public String name;
	public long   population;
	public boolean polluted;
	public String  oldName;
	
	
	public City(String name, long population, boolean polluted, String oldName) {
		super();
		this.name = name;
		this.population = population;
		this.polluted = polluted;
		this.oldName = oldName;
	}
	public void shoot()
	{
		System.out.println(name);
		System.out.println(population);
		System.out.println(polluted);
		System.out.println(oldName);
	}
	
	

}
