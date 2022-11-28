package com.uday.connection.bridge;

import com.uday.connection.rules.Mobile;

public class MobileUser implements Mobile {

	public String name() {
		System.out.println("name");
		return null;
	}

	public String brand() {
		System.out.println("brand");
		return null;
	}

	public String configOfmobile() {
		System.out.println("config Of mobile");
		return null;
	}

	public double price() {
		System.out.println("price");
		return 0;
	}

	public double yearOfmobile() {
		System.out.println("year Of mobile");
		return 0;
	}

}
