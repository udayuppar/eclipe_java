package com.xworkz.collections.boot;

import java.util.HashSet;
import java.util.Set;

public class Coupoun {

	public static void main(String[] args) {

		String coupoun1 = "Percentage-based coupons";
		String coupoun2 = "Fixed price coupons";
		String coupoun3 = " BOGO coupons";
		String coupoun4 = " Free shipping coupons";
		String coupoun5 = " Advanced shipping coupons";
		String coupoun6 = "Automatic coupons";
		String coupoun7 = " Loyalty points";
		String coupoun8 = "Gift Cards";
		String coupoun9 = "URL coupons";
		String coupoun10 = "POne-click coupons";
		String coupoun11 = "Free gift with purchase coupons";
		String coupoun12 = "After purchase coupons";

		Set<String> set = new HashSet();
		set.add(coupoun1);
		set.add(coupoun2);
		set.add(coupoun3);
		set.add(coupoun4);
		set.add(coupoun5);
		set.add(coupoun6);
		set.add(coupoun7);
		set.add(coupoun8);
		set.add(coupoun9);
		set.add(coupoun10);
		set.add(coupoun11);
		set.add(coupoun12);

		set.clear();

		System.out.println(set.size());
		System.out.println("After clear...... ");
	}

}
