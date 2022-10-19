package com.uday.copies.boot;

import com.uday.copies.constructerr.Apps;
import com.uday.copies.things.Mobile;

public class MobileRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] items = { "Redmi", "Vivo", "oppo", "Iphone" };
		String[] col = { "red", "block", "white", "brown" };
		String[] pro = { "dragen 650", "Apple A16 Bionic", "Snapdragon 8 Plus ", "Dimensity 9000 Plus" };
		double[] cost = { 25000, 60000, 50000, 90000 };
		float[] cm = { 5, 6, 5, 5 };

		Mobile mob = new Mobile("Redmi", "Redmi note 5pro", 20000, true, true, items, col, pro, cost, cm, Apps.CAMARA);
		mob.print();

	}

}
