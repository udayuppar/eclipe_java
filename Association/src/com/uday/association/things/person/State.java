package com.uday.association.things.person;

public class State {

	public String name;
	public String countryName;
	public long   area;
	public int    noOfCompanies;
	
	public State(String name, String countryName, long area, int noOfCompanies) {
		super();
		this.name = name;
		this.countryName = countryName;
		this.area = area;
		this.noOfCompanies = noOfCompanies;
	}
	public void kill()
	{
		System.out.println(name);
		System.out.println(countryName);
		System.out.println(area);
		System.out.println(noOfCompanies);
	}
	
	

}
