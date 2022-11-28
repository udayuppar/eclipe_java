package com.uday.connection.bridge;

import com.uday.connection.rules.Medical;

public class MedicalUser implements Medical{

	public String name() {
		System.out.println("name");
		return null;
	}

	public String location() {
		System.out.println("location");
		return null;
	}

	public String ownerName() {
		System.out.println("ownerName");
		return null;
	}

	public boolean godForHelth() {
		System.out.println("god For Helth");
		return false;
	}

	public int shopNumber() {
		System.out.println("shop Number");
		return 0;
	}

}
