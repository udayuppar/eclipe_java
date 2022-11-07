package com.uday.inheritence.child.court;

import com.uday.inheritence.things.Court;

public class SupremCourt extends Court {
	public String location;
	public  int noOfLawyer;
	
	public SupremCourt() {
		System.out.println("default Suprem court const");
	}

}
