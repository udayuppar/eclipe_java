package com.uday.association.things.person;

public class Address {
	public Location location;
	
	public void showOff()
	{
		if(location!=null)
		{
			location.check();
		}
	}

}
