package com.uday.copies.things;

import com.uday.copies.boot.Bakary;

public class BakaryRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] item = { "Chacolate", "Venella", "Strabery", "Butter Skacth" };
		String[] temp = { "Red", "Orange", "yellow", "pink" };
		int[] value = { 500, 300, 433, 550, 600 };
		String[] teast = { "Parlege", "20-20", "Gudde", "Maari", "Britaniya" };
		String[] pupfs = { "Onian", "Tomato", "potato", "chilly" };
		long[] no = { 8861539422l, 9741627422l, 9874563214l, 9638527412l };

		Bakary bekary = new Bakary("Appu bekary", "uday", 10, 900, 8754698745l, item, temp, value, teast, pupfs, no);
		System.out.println(bekary.name);
		System.out.println(bekary.owenName);
		System.out.println(bekary.stalNumber);
		System.out.println(bekary.cakePrice);
		System.out.println(bekary.mobileNumber);
		System.out.println(bekary.flevor);
		System.out.println(bekary.colour);
		System.out.println(bekary.priceList);
		System.out.println(bekary.biscketName);
		System.out.println(bekary.pupfs);
		System.out.println(bekary.mobileNo);
		bekary.display();

		Bakary bekary2 = new Bakary("AS bekary", "raj", 5, 700, 6544698745l, item, temp, value, teast, pupfs, no);
		bekary2.display();

	}

}
