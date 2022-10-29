package com.uday.association.things.country;

public class Country {
	public String countryName;
	public String capital;
	public double area;
	public President president=new President("Narendra Modi",6);
	public City[] cites;
	
	public Country(String countryName, String capital, double area) {
		super();
		this.countryName = countryName;
		this.capital = capital;
		this.area = area;
	
	}
	public void setCites( City[] cites)
	{
		this.cites=cites;
		
	}
	
	public void showOff()
	{
		System.out.println("country Name:"+countryName);
		System.out.println("capital Name:"+capital);
		System.out.println("area:"+area);
		System.out.println("***************************");
		if(president!=null) {
			this.president.name=president.name;
			this.president.tenture=president.tenture;
		}
		if(cites!=null) {
			for (int i = 0; i < cites.length; i++) {
				City city = cites[i];
				System.out.println(city);
				if(city!=null) {
					city.showOff();
				}
				
			}
		}
	}
	
	

}
