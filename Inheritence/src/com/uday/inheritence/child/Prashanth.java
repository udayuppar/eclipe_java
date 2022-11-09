package com.uday.inheritence.child;

import com.uday.inheritence.things.Director;

public class Prashanth extends Director {
	
	public int age;
	public String location;

	public Prashanth(String directorName, int noOfFilms, boolean famous,int age,String location) {
		super(directorName, noOfFilms, famous);
		this.age=age;
		this.location=location;
	}
	
	public void showOff()
	{
		super.showOff();
		System.out.println(age);
		System.out.println(location);
	}

}
