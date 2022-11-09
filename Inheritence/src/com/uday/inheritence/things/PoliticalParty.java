package com.uday.inheritence.things;

public class PoliticalParty {
	
	public int noOfMembers;
	public String partyName;
	public PoliticalParty(int noOfMembers, String partyName) {
		super();
		this.noOfMembers = noOfMembers;
		this.partyName = partyName;
	}
	
	public void showOff()
	{
		System.out.println("-----------Party detailse--------------");
		System.out.println(this.noOfMembers);
		System.out.println(this.partyName);
	}

}
