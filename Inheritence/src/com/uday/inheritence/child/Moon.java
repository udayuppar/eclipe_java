package com.uday.inheritence.child;

import com.uday.inheritence.things.Satelite;

public class Moon extends Satelite {
	
	public double distenceFromEarth;
	public Moon(String name, int launchYear,double distenceFromEarth) {
		super(name, launchYear);
		this.distenceFromEarth=distenceFromEarth;
		
	}
	
	public void display() {
		
		super.display();
		System.out.println(distenceFromEarth);
	}

	
	
	

}
