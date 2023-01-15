package com.xworkz.map.boot;

import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class Mobile {

	public static void main(String[] args) {
		 Map<String, Double> map=new TreeMap<String, Double>((sort1,sort2)->sort2.compareTo(sort1));
		 map.put("Redmi", 200d);
		 map.put("Oppo", 20000d);
		 map.put("Vivo", 21000d);
		 map.put("Poco", 18000d);
		 map.put("One Plus", 30000d);
		 map.put("Realme", 26000d);
		 map.put("IPhone", 50000d);
		 map.put("Nokia", 100d);
		 map.put("Samsaung", 32000d);
		 
		 System.out.println("=====Print all the Entryes in capital letters");
			map.forEach((key,value)->{
				System.out.println(    "Mobile phone:"+ key.toUpperCase() +"         Price:"+ value);
			
			});
			
			System.out.println("=====print entries if price is grether than 10000");
			map.forEach((key,value)->{System.out.println("*********************************");
			if(value>20000) {
				System.out.println("Mobile name:"+key+"price"+value);
			}
			});
			
			System.out.println(System.lineSeparator());
			System.out.println("====print entries if key is less than 5 charecters");
			map.forEach((key,value)->{System.out.println("=======================");
			if(key.length()<=5) {
				System.out.println("mobile name:"+key);
			}
			});
			
			

	}

}
