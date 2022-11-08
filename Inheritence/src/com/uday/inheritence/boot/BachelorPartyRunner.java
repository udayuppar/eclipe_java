package com.uday.inheritence.boot;

import com.uday.inheritence.child.Party;

public class BachelorPartyRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Party party=new Party("Rajajinagar", 50000, 50);
		System.out.println(party.expendatur);
		System.out.println(party.noOfFreinds);
		System.out.println(party.vennue);
		

	}

}
