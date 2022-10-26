
package com.uday.instences.things;

import com.uday.instences.Constructer.MangoType;

public class Mango {

	public final String name = "Totapuri";
	public static int price;
	public int quantity;
	public boolean sweet;
	public String uses = "pickels";
	public MangoType THOTAPURI=MangoType.KESAR;

	static {
		Mango.price = 500;
	}

	public Mango(int quantity) {
		this.quantity = quantity;
	}

	public void setMango() {
		this.sweet = true;
	}

	public void display() {
		System.out.println(this.name);
		System.out.println(Mango.price);
		System.out.println(this.quantity);
		System.out.println(this.sweet);
		System.out.println(this.uses);
		System.out.println(this.THOTAPURI);

	}

}
