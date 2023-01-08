package com.xworkz.map.boot;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Area {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(577228, "Tarikere");
		map.put(577225, "Shivmogga");
		map.put(577264, "Chikkamagalur");
		map.put(577297, "Hasan");
		map.put(577204, "Bengalur");
		map.put(577209, "Arsikere");
		map.put(577220, "Birur");
		map.put(577221, "Kadur");

		System.out.println("==========Access  only by Keys========");
		Set<Integer> keys = map.keySet();
		keys.forEach(e -> System.out.println(e));

		System.out.println(System.lineSeparator());
		System.out.println("==========Access  only by Values========");
		Collection<String> values = map.values();
		values.forEach(e -> System.out.println(e));

		System.out.println(System.lineSeparator());
		System.out.println("==========Access by Pairs (Keys and Values)========");
		Set<Entry<Integer, String>> pairs = map.entrySet();
		pairs.forEach(e -> System.out.println(e));

	}

}
