package com.uday.copies.boot;

import com.uday.copies.things.Laptop;

public class LaptopRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] items = { "HP", "Dell", "Lenova", "Acces" };
		String[] temp = { "block", "white", "brown", "red" };
		int[] value = { 32, 64, 128, 360 };
		String[] core = { "intel core i3", "intel core i5", "intel core i7", "intel core i9" };
		double[] cost = { 55000, 64000, 53252, 68745, 74562 };

		Laptop laptop = new Laptop("HP", "Uday", false, 65200, 2, items, temp, value, core, cost);
		laptop.print();

	}

}
