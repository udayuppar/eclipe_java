package com.uday.inheritence.child.court;

import com.uday.inheritence.things.Court;

public class DistrictCourt extends Court {
	
	public String courtName;
	public boolean government;
	
	public DistrictCourt() {
		System.out.println("default district court const");
	}

}
