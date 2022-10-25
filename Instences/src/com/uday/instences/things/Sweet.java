/**
 * 
 */
package com.uday.instences.things;

/**
 * @author Uday
 *
 */
public class Sweet {

	public final String name = "Laddu";
	public static String colour;
	public double price;
	public int quantity;
	public String type = "festival";

	static {
		Sweet.colour = "red";

	}

	public Sweet(double price) {
		this.price = price;
	}

	public void setSweet() {
		this.quantity = 50;
	}

	public void display() {
		System.out.println(this.name);
		System.out.println(Sweet.colour);
		System.out.println(this.price);
		System.out.println(this.quantity);
		System.out.println(this.type);
	}

}
