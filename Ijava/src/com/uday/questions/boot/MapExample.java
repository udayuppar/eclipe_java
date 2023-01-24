package com.uday.questions.boot;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;



public class MapExample {
	public static void main(String[] args) {
		
		Map<String, Double> map=new HashMap<String, Double>();
		map.put("India", +91d);
		map.put("Pakistan", +92d);
		map.put("Shrilanka", +94d);
		map.put("NewZeland", +95d);
		map.put("Englend", +96d);
		
		Set<Entry<String,Double>> ref=map.entrySet();
		ref.forEach(e->System.out.println(e));
		
	}

}
