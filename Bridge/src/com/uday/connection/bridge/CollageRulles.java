package com.uday.connection.bridge;

import com.uday.connection.rules.Collage;

public class CollageRulles implements Collage {

	public String name() {
		System.out.println("diaplay the Student name");
		return null;
	}

	public String principleName() {
		System.out.println("diaplay the principle name");
		return null;
	}

	public double noOfStudent() {
		System.out.println("diaplay the no of Student");
		return 0;
	}

	public int noOfStaffs() {
		System.out.println("diaplay the no of Staffs");
		return 0;
	}

	public boolean good() {
		System.out.println("diaplay the collage is good or bad");
		return true;
	}

}
