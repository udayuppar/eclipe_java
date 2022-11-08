package com.uday.inheritence.child;

import com.uday.inheritence.things.BachelorParty;

public class Party  extends BachelorParty{

	public Party(String vennue, double expendatur, int noOfFreinds) {
		super(vennue, expendatur, noOfFreinds);
		System.out.println("Party detailse");
	}
	

}
