package com.uday.copies.boot;

public class Bakary {

	public String name;
	public String owenName;
	public int stalNumber;
	public double cakePrice;
	public long mobileNumber;
	public String[] flevor;
	public String[] colour;
	public int[] priceList;
	public String[] biscketName;
	public String[] pupfs;
	public long[] mobileNo;

	public Bakary(String name, String owenName, int stalNumber, double cakePrice, long mobileNumber, String[] flevor,
			String[] colour, int[] priceList, String[] biscketName, String[] pupfs, long[] mobileNo) {
		this.name = name;
		this.owenName = owenName;
		this.stalNumber = stalNumber;
		this.cakePrice = cakePrice;
		this.mobileNumber = mobileNumber;
		this.flevor = flevor;
		this.colour = colour;
		this.priceList = priceList;
		this.biscketName = biscketName;
		this.pupfs = pupfs;
		this.mobileNo = mobileNo;

	}

	public void display() {
		System.out.println(this.name);
		System.out.println(this.owenName);
		System.out.println(this.stalNumber);
		System.out.println(this.cakePrice);
		System.out.println(this.mobileNumber);
		System.out.println("*************************************");

		System.out.println("No of Flavors");
		System.out.println("*************************************");

		for (int i = 0; i < flevor.length; i++) {
			String ref = flevor[i];
			System.out.println(ref);
		}
		System.out.println("*************************************");

		System.out.println("No of colour");
		System.out.println("*************************************");
		for (int i = 0; i < colour.length; i++) {
			String ref = colour[i];
			System.out.println(ref);
		}
		System.out.println("*************************************");
		System.out.println("price list of cakes");
		System.out.println("*************************************");
		for (int i = 0; i < priceList.length; i++) {
			int ref = priceList[i];
			System.out.println(ref);
		}
		System.out.println("*************************************");
		System.out.println("Different type of biscket");
		System.out.println("*************************************");
		for (int i = 0; i < biscketName.length; i++) {
			String ref = biscketName[i];
			System.out.println(ref);
		}
		System.out.println("*************************************");
		System.out.println("Different type of pupfs");
		System.out.println("*************************************");
		for (int i = 0; i < pupfs.length; i++) {
			String ref = pupfs[i];
			System.out.println(ref);
		}
		System.out.println("*************************************");
		System.out.println("No of mobile number");
		System.out.println("*************************************");
		for (int i = 0; i < mobileNo.length; i++) {
			long ref = mobileNo[i];
			System.out.println(ref);
		}
		System.out.println("*************************************");
		System.out.println("print the constructer values");

	}
}
