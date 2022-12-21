package com.xworkz.collections.boot.access;

import java.util.Collection;
import java.util.Iterator;
import java.util.TreeSet;

public class MetroCityNameRunner {

	public static void main(String[] args) {

		String name1 = "Yashwanthpur";
		String name2 = "Mahalakshmi";
		String name3 = "Rajajinagr";
		String name4 = "Mahakavi kuvempu Road";
		String name5 = "Shrerampur";

		Collection<String> group = new TreeSet<String>();
		group.add(name1);
		group.add(name2);
		group.add(name3);
		group.add(name4);
		group.add(name5);

		System.out.println(group.size());
		System.out.println(group);

		System.out.println(System.lineSeparator());
		
		System.out.println("for each method");
		for (String metro : group) {
			System.out.println(metro);
		}
		System.out.println(System.lineSeparator());
		
		System.out.println("Iterator method");
		Iterator<String> city = group.iterator();
		while (city.hasNext()) {
			String names = city.next();
			System.out.println(names);

		}

	}

}
