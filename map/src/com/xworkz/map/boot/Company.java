package com.xworkz.map.boot;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Company {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, String> map=new HashMap<String, String>();
		map.put("Microsoft", "Web Browser");
		map.put("IBM", "Adobe Photoshop");
		map.put("Google", "Picasa");
		map.put("Infosys", "VLC Media Player");
		map.put("Wipro", "Windows Media Player");
		map.put("TCS", "Windows Movie Maker");
		map.put("First America", "Multimedia software");
		map.put("Tech mahendra", "E-mail Client");
		map.put("Delaite", "Web Browser");
		
		System.out.println("==========Access  only by Keys========");
		Set<String> keys = map.keySet();
		keys.forEach(e -> System.out.println(e));

		System.out.println(System.lineSeparator());
		System.out.println("==========Access  only by Values========");
		Collection<String> values = map.values();
		values.forEach(e -> System.out.println(e));

		System.out.println(System.lineSeparator());
		System.out.println("==========Access by Pairs (Keys and Values)========");
		Set<Entry<String, String>> pairs = map.entrySet();
		pairs.forEach(e -> System.out.println(e));

	}

}
