package com.xworkz.collections.boot.access;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class WatchRunner {

	public static void main(String[] args) {

		String watch1 = "Rolex";
		String watch2 = "FastRack";
		String watch3 = "Sonata";
		String watch4 = "Titan";
		String watch5 = "Casio";

		Collection<String> collection = new LinkedList<String>();
		collection.add(watch1);
		collection.add(watch2);
		collection.add(watch3);
		collection.add(watch4);
		collection.add(watch5);

		System.out.println(collection.size());
		System.out.println(collection);
		System.out.println(System.lineSeparator());

		System.out.println("--------------for each loop-------------");
		for (String rolex : collection) {
			System.out.println(rolex);
		}

		System.out.println(System.lineSeparator());

		System.out.println("---------------Itetatior method--------------");
		Iterator<String> iterable = collection.iterator();
		while (iterable.hasNext()) {
			String watch = iterable.next();
			System.out.println(watch);
		}

	}

}
