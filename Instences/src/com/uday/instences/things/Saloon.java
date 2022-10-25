/**
 * 
 */
package com.uday.instences.things;

/**
 * @author Uday
 *
 */
public class Saloon {

	public final String name = "Adem";
	public static String ownerName;
	public int price;
	public int noOfWorkers;
	public int noOfMirrors = 10;

	static {
		Saloon.ownerName = "uday";

	}

	public Saloon(int price) {
		this.price = price;

	}

	public void setSaloon() {
		this.noOfWorkers = 5;
	}

	public void display() {
		System.out.println(this.name);
		System.out.println(Saloon.ownerName);
		System.out.println(this.price);
		System.out.println(this.noOfWorkers);
		System.out.println(this.noOfMirrors);
	}

}
