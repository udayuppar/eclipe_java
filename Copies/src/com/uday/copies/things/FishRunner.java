package com.uday.copies.things;

import com.uday.copies.boot.Fish;

public class FishRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Fish fish = new Fish();
		System.out.println(fish.length);
		System.out.println(fish.name);
		System.out.println(fish.price);
		System.out.println(fish.size);
		System.out.println(fish.weight);

		System.out.println("*************");

		Fish fish1 = new Fish("Bangada");
		System.out.println(fish1.length);
		System.out.println(fish1.name);
		System.out.println(fish1.price);
		System.out.println(fish1.size);
		System.out.println(fish1.weight);
		System.out.println("*************");

		Fish fish2 = new Fish('M');
		System.out.println(fish2.length);
		System.out.println(fish2.name);
		System.out.println(fish2.price);
		System.out.println(fish2.size);
		System.out.println(fish2.weight);
		System.out.println("*************");

		Fish fish3 = new Fish(500, 2);
		System.out.println(fish3.length);
		System.out.println(fish3.name);
		System.out.println(fish3.price);
		System.out.println(fish3.size);
		System.out.println(fish3.weight);
		System.out.println("*************");

		Fish fish4 = new Fish(2);
		System.out.println(fish4.length);
		System.out.println(fish4.name);
		System.out.println(fish4.price);
		System.out.println(fish4.size);
		System.out.println(fish4.weight);
		System.out.println("*************");

		Fish fish5 = new Fish(1f);
		System.out.println(fish5.length);
		System.out.println(fish5.name);
		System.out.println(fish5.price);
		System.out.println(fish5.size);
		System.out.println(fish5.weight);
		System.out.println("*************");

		Fish fish6 = new Fish(1f, "shark");
		System.out.println(fish6.length);
		System.out.println(fish6.name);
		System.out.println(fish6.price);
		System.out.println(fish6.size);
		System.out.println(fish6.weight);
		System.out.println("*************");

		Fish fish7 = new Fish('L', "Shark");
		System.out.println(fish7.length);
		System.out.println(fish7.name);
		System.out.println(fish7.price);
		System.out.println(fish7.size);
		System.out.println(fish7.weight);
		System.out.println("*************");

	}

}
