package com.uday.inheritence.child;

import com.uday.inheritence.things.Criminal;

public class Ravi extends Criminal {
	
	public String place;
	public String offence;
	
	public Ravi(String name, String criminalType, int noOfCriminals,String place,String offence) {
		super(name, criminalType, noOfCriminals);
		this.offence=offence;
		this.place=place;
		
		
	}
	
	public void display()
	{
		super.display();
		System.out.println(offence);
		System.out.println(place);
	}
	
	
	
	
	

}
