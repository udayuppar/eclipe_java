package com.xworkz.map.boot;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class PgName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, Double> map=new HashMap<String, Double>();
		map.put("VR PG", 6000d);
		map.put("Khushi", 7000d);
		map.put("Gayatri", 6000d);
		map.put("Manjunatha", 10000d);
		map.put("Aradhya", 6000d);
		map.put("Density", 9000d);
		map.put("HI-FI pG", 8000d);
		map.put("Royal", 6500d);
		map.put("Khrishna", 4000d);
		map.put("Govinda", 5000d);
		
		
		System.out.println(map.size());
		 System.out.println(System.lineSeparator());
		 System.out.println("==========Access  only by Keys========");
		 Set<String> keys=map.keySet();
		 keys.forEach(e->System.out.println(e));
		 
		 System.out.println(System.lineSeparator());
		 System.out.println("==========Access  only by Valus========");
		 Collection<Double> values=map.values();
		 values.forEach(e->System.out.println(e));
		 
		 
		 System.out.println(System.lineSeparator());
		 System.out.println("==========Access by Pairs (Keys and Values)========");
		 Set<Entry<String,Double>> pairs=map.entrySet();
		 pairs.forEach(e->System.out.println(e));
		 
		 
		 

	}

}
