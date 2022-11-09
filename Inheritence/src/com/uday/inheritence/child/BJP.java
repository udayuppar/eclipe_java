package com.uday.inheritence.child;

import com.uday.inheritence.things.PoliticalParty;

public class BJP  extends PoliticalParty{
	
	public String president;

	public BJP(int noOfMembers, String partyName,String president) {
		super(noOfMembers, partyName);
		this.president=president;
		
		
		
	}
	
	public void showOff() {
		super.showOff();
		System.out.println(this.president);
	}
	

}
