package com.uday.inheritence.boot;

import com.uday.inheritence.child.Birthday;
import com.uday.inheritence.things.Invitation;

public class InvitationRunner {

	public static void main(String[] args) {
			 
		Invitation invitation=new Birthday("Birthday", 5000, "papar");
		System.out.println("Invitation detailse");
		System.out.println(invitation.noOfCopies);
		System.out.println(invitation.purpuse);
		System.out.println(invitation.type);
		

	}

}
