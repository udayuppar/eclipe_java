package com.uday.inheritence.things;

public class Director {
	
	public String directorName;
	public int noOfFilms;
	public boolean famous;
	public Director(String directorName, int noOfFilms, boolean famous) {
		super();
		this.directorName = directorName;
		this.noOfFilms = noOfFilms;
		this.famous = famous;
	}
	
	public void showOff()
	{
		System.out.println("------Director detailse---");
		System.out.println(directorName);
		System.out.println(noOfFilms);
		System.out.println(famous);
	}

}
