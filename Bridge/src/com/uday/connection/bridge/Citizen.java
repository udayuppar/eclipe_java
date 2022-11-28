package com.uday.connection.bridge;

import com.uday.connection.rules.TrafficRulls;

public class Citizen implements TrafficRulls {

	public boolean wareHelmet() {
		System.out.println("ware helmet compulsary");
		return false;
	}

	public boolean tripleRidding() {
		System.out.println("triple riding is affence");
		return false;
	}

	public String inspectorName() {
		System.out.println("Display the inspector name");
		return null;
	}

	public double salary() {
		System.out.println("display the salary");
		return 0;
	}

	public boolean governmentJob() {
		System.out.println("governmentJob or not");
		return false;
	}

}
