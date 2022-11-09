package com.uday.inheritence.things;

public class Orion {

	public String ownerName;
	public String location;

	public Orion(String ownerName, String location) {
		super();
		this.ownerName = ownerName;
		this.location = location;
	}
	
	public void display()
	{
		System.out.println(this.ownerName);
		System.out.println(this.location);
	}

}
