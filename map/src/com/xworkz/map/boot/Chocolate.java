package com.xworkz.map.boot;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Chocolate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, Double> map=new HashMap<String, Double>();
		map.put("Dairy Milk", 500d);
		map.put("Kit kat", 80d);
		map.put("Snickers", 200d);
		map.put("Dark chocolate", 400d);
		map.put("Oreo", 100d);
		map.put("Dark Fantasy", 500d);
		map.put("Block cury", 500d);
		map.put("Milk way", 500d);
		map.put("Silk chocolate", 500d);
		
		System.out.println(map.size());
		System.out.println(System.lineSeparator());
		 System.out.println("==========Access  only by Keys========");
		  Set<String> keys=map.keySet();
		  keys.forEach(e->System.out.println(e));
		  
		  System.out.println(System.lineSeparator());
			 System.out.println("==========Access  only by Values========");
			 Collection<Double> values=map.values();
			 values.forEach(e->System.out.println(e));
			 
			 System.out.println(System.lineSeparator());
			 System.out.println("==========Access by Pairs (Keys and Values)========");
			 Set<Entry<String,Double>> pairs=map.entrySet();
			 pairs.forEach(e->System.out.println(e));

	}

}
