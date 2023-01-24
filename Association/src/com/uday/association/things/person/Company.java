package com.uday.association.things.person;

public class Company {
	
	public String name;
	public String owerName;
	public Address address;
	
	public Company(String name, String owerName) {
		super();
		this.name = name;
		this.owerName = owerName;
	}
	
	public void display()
	{
		System.out.println(name);
		System.out.println(owerName);
		System.out.println("*****************************");
		if(address!=null)
		{
			address.showOff();
		}
		
	}

}
