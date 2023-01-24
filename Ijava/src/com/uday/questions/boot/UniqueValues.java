package com.uday.questions.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class UniqueValues {

	public static void main(String[] args) {

		HashSet<Integer> set1 = new HashSet<Integer>();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);

		HashSet<Integer> set2 = new HashSet<Integer>();
		set2.add(1);
		set2.add(2);
		set2.add(5);
		set2.add(6);

		Collection<Integer> collection = new HashSet<Integer>();
		collection.addAll(set1);
		collection.addAll(set2);

		
		for (Integer integer : collection) {
			// System.out.println(integer);
		}
		set1.removeAll(set2);
		set2.removeAll(set1);
		System.out.println(set1+"  "+set2);

	}
}
