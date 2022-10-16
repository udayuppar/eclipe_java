package com.uday.copies.things;

import com.uday.copies.boot.TextileShop;

public class TextileShopRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TextileShop textile = new TextileShop();
		System.out.println(textile.ownerName);
		System.out.println(textile.ownerWifeName);
		System.out.println(textile.ownerDaughterName);
		System.out.println(textile.ownerDaughterNumber);
		System.out.println(textile.shopNo);
		System.out.println(textile.contactNumber);
		System.out.println("**********************************");

		TextileShop textile2 = new TextileShop("Ram", "Seeta");
		System.out.println(textile2.ownerName);
		System.out.println(textile2.ownerWifeName);
		System.out.println(textile2.ownerDaughterName);
		System.out.println(textile2.ownerDaughterNumber);
		System.out.println(textile2.shopNo);
		System.out.println(textile2.contactNumber);
		System.out.println("**********************************");

		TextileShop textile3 = new TextileShop("Ram", "Seeta", "Prithi");
		System.out.println(textile3.ownerName);
		System.out.println(textile3.ownerWifeName);
		System.out.println(textile3.ownerDaughterName);
		System.out.println(textile3.ownerDaughterNumber);
		System.out.println(textile3.shopNo);
		System.out.println(textile3.contactNumber);
		System.out.println("**********************************");

		TextileShop textile4 = new TextileShop("raj", "ram", 8861539422l);
		System.out.println(textile4.ownerName);
		System.out.println(textile4.ownerWifeName);
		System.out.println(textile4.ownerDaughterName);
		System.out.println(textile4.ownerDaughterNumber);
		System.out.println(textile4.shopNo);
		System.out.println(textile4.contactNumber);
		System.out.println("**********************************");

		TextileShop textile5 = new TextileShop("shiva", "parvathi", 9741627422l, 8861539422l);
		System.out.println(textile5.ownerName);
		System.out.println(textile5.ownerWifeName);
		System.out.println(textile5.ownerDaughterName);
		System.out.println(textile5.ownerDaughterNumber);
		System.out.println(textile5.shopNo);
		System.out.println(textile5.contactNumber);
		System.out.println("**********************************");

		TextileShop textile6 = new TextileShop(20, 8861539422l);
		System.out.println(textile6.ownerName);
		System.out.println(textile6.ownerWifeName);
		System.out.println(textile6.ownerDaughterName);
		System.out.println(textile6.ownerDaughterNumber);
		System.out.println(textile6.shopNo);
		System.out.println(textile6.contactNumber);
		System.out.println("**********************************");

		TextileShop textile7 = new TextileShop(20, 8861539422l, "Shiva");
		System.out.println(textile7.ownerName);
		System.out.println(textile7.ownerWifeName);
		System.out.println(textile7.ownerDaughterName);
		System.out.println(textile7.ownerDaughterNumber);
		System.out.println(textile7.shopNo);
		System.out.println(textile7.contactNumber);
		System.out.println("**********************************");

		TextileShop textile8 = new TextileShop(20, 8861539422l, "raj");
		System.out.println(textile8.ownerName);
		System.out.println(textile8.ownerWifeName);
		System.out.println(textile8.ownerDaughterName);
		System.out.println(textile8.ownerDaughterNumber);
		System.out.println(textile8.shopNo);
		System.out.println(textile8.contactNumber);
		System.out.println("**********************************");

	}

}
