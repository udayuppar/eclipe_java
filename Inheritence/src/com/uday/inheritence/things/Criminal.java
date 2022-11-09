package com.uday.inheritence.things;

public class Criminal {
	public String name;
	public String criminalType;
	public int noOfCriminals;
	
	
	public Criminal(String name, String criminalType, int noOfCriminals) {
		super();
		this.name = name;
		this.criminalType = criminalType;
		this.noOfCriminals = noOfCriminals;
	}
	
	public void display()
	{
		System.out.println("--- Criminal detailse-----");
		System.out.println(this.name);
		System.out.println(this.criminalType);
		System.out.println(this.noOfCriminals);
	}
	
	

}
