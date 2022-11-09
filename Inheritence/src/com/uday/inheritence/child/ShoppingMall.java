package com.uday.inheritence.child;

import com.uday.inheritence.things.Orion;

public class ShoppingMall extends Orion {

	public int noOfSections;

	public ShoppingMall(String ownerName, String location,int noOfSections) {
		super(ownerName, location);
		this.noOfSections = noOfSections;
	}
	
	public void display()
	{
		super.display();
		System.out.println(this.noOfSections);
		
		
	}

}
