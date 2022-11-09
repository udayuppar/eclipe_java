package com.uday.inheritence.things;

public class Satelite {
	public String name;
	public int launchYear;
	public Satelite(String name, int launchYear) {
		super();
		this.name = name;
		this.launchYear = launchYear;
	}
	
	public void display()
	{
		System.out.println("Satelite detailse");
		System.out.println(name);
		System.out.println(launchYear);
	}

}
