package com.uday.copies.boot;

import com.uday.copies.constructerr.SeatType;
import com.uday.copies.things.Theater;

public class TheatorRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] item = { "Kantara", "Vikram", "KGF", "Kranthi" };
		int[] temp = { 250, 200, 150, 180 };
		int[] value = { 1, 2, 3, 4 };
		String[] lun = { "kannada", "Telugu", "Temil", "Hindi" };
		String[] effect = { "Normal", "3D", "2D", "HD" };

		Theater movie = new Theater("Navarang", "Rajajinagar", "uday", 500, false, item, temp, value, lun, effect,
				SeatType.GANDHI_CLASS);
		movie.print();

	}

}
