package com.uday.connection.bridge;

import com.uday.connection.rules.PolliceStation;

public class Criminals implements PolliceStation {

	public String name() {
		System.out.println("police station name");
		return null;
	}

	public String subInspectorName() {
		System.out.println("display the sub inspector name");
		return null;
	}

	public int noOfWards() {
		System.out.println("Display the no of wards");
		return 0;
	}

	public int noOfCriminals() {
		System.out.println("Display the no of criminals");
		return 0;
	}

	public boolean good() {
		System.out.println("station is good or bad");
		return false;
	}

}
