package com.uday.association.things.country;

public class City {
	public String name;
	public String cityCapital;
	public int noOfcityes;
	public Name cityName =new  Name("Hindustan", "India",null);
	
	public City(String name, String cityCapital, int noOfcityes) {
		super();
		this.name = name;
		this.cityCapital = cityCapital;
		this.noOfcityes = noOfcityes;
	}
	
	public void showOff()
	{
		System.out.println("city name:"+name);
		System.out.println("city Capital name:"+cityCapital);
		System.out.println("no Of cityes:"+noOfcityes);
		System.out.println("******************************");
		if(cityName!=null) {
			this.cityName.oldName=cityName.oldName;
			this.cityName.newName=cityName.newName;
			this.cityName.futurName=cityName.futurName;
		}
		cityName.display();
	}
	
	

}
