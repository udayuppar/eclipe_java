package com.xworkz.map.boot;

import java.util.Map;
import java.util.TreeMap;

public class CricketPlayer {

	public static void main(String[] args) {
		
		Map<String, Double> map=new TreeMap<String, Double>((sort1,sort2)->sort2.compareTo(sort1));
		map.put("Virat kohli",32000d );
		map.put("ABD",25000d );
		map.put("Rohit Sharma",20000d );
		map.put("MS Dhoni",15000d );
		map.put("Surya kumar yadav",8000d );
		
		map.forEach((Key,value)->System.out.println("Player Name:"+ Key +"        Runs:"+value));
		
		
		System.out.println(System.lineSeparator());
		System.out.println("remove an entryes if runs less than 20000");
		map.forEach((key,value)->{System.out.println("---------------------------");
				if(value<=20000) {
					System.out.println("runs:"+value);
				}
				
		});
		
		

	}

}
