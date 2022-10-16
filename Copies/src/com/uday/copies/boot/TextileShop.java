package com.uday.copies.boot;

public class TextileShop {

	public String ownerName;
	public String ownerWifeName;
	public String ownerDaughterName;
	public long ownerDaughterNumber;
	public int shopNo;
	public long contactNumber;

	public TextileShop() {
		System.out.println("print all the default values");
	}

	public TextileShop(String ownerName, String ownerWifeName) {
		this();
		this.ownerWifeName = ownerWifeName;
		this.ownerName = ownerName;
		System.out.println("print the ownerName and ownerWifeName");

	}

	public TextileShop(String ownerName, String ownerWifeName, String ownerDaughterName) {
		this("Seetha", "Ram");
		this.ownerDaughterName = ownerDaughterName;
		System.out.println("print the ownerName,ownerWifeName and ownerDaughterName");

	}

	public TextileShop(String ownerName, String ownerWifeName, long ownerDaughterNumber) {
		this("Radhe", "Krishna");
		this.ownerDaughterNumber = ownerDaughterNumber;
		System.out.println("print the ownerName,ownerWifeName and ownerDaughterNumber");

	}

	public TextileShop(String ownerName, String ownerWifeName, long ownerDaughterNumber, long contactNumber) {
		this(ownerWifeName, ownerName, "Lakshmi");
		this.contactNumber = contactNumber;
		System.out.println("print the ownerName,ownerWifeName ,ownerDaughterNumber and contactNumber ");

	}

	public TextileShop(int shopNo, long contactNumber) {
		this.shopNo = shopNo;
		this.contactNumber = contactNumber;
		System.out.println("print the shop number and contact number");
	}

	public TextileShop(int shopNo, long contactNumber, String ownerName) {
		this(20, 8861539422l);
		this.ownerName = ownerName;
		System.out.println("print the shop number and contact number");
	}

	public TextileShop(int shopNo, long contactNumber, String ownerName, String ownerWifeName) {
		this(20, 8861539422l, "Ram");
		this.ownerWifeName = ownerWifeName;
		System.out.println("print the shop number and contact number");
	}

}
