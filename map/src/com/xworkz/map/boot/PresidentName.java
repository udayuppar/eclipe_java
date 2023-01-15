package com.xworkz.map.boot;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class PresidentName {
	public static void main(String[] args) {
		
		Map<String, String> map=new TreeMap<String, String>();
		map.put("India", "Droupadi Murmu");
		map.put("China", "Xi Jinping, Premier of the State Council ");
		map.put("Kazakhstan", "Qasym Zhomart Toqaev");
		map.put("Saudi Arabia", "King Salman");
		map.put("Iran", " Ali Khamenei");
		map.put("Mongolia", " Khaltmaagiin Battulga");
		map.put("Indonesia", "Joko Widodo");
		map.put("Pakistan", "Arif Alvi");
		map.put("Turkey", "Recep Tayyip Erdogan");
		map.put("Afghanistan", "Mohammad Hassan Akhund");
		map.put("Yemen", "Abdrabbuh Mansur Hadi");
		map.put("Thailand", "King Maha Vajiralongkorn");
		map.put("Turkmenistan", "Gurbanguly Berdimuhamedow");
		map.put("Iraq", " Barham Salih");
		map.put("Japan", " Emperor Naruhito");
		map.put("Malaysia", "Yang di-Pertuan Agong Abdullah Sultan Ahmad Shah");
		map.put("Oman", " Haitham bin Tarik");
		map.put("Philippines", "Rodrigo Duterte");
		map.put("Syria", "Bashar al Assad");
		map.put("Bangladesh", " Abdul Hamid");
		
		System.out.println(map.size());
		
		System.out.println("=======Sort the map Acending keys");
		map.forEach((key,value)->
		System.out.println("Country name :"+key + "President name :"+value));
		
		System.out.println(System.lineSeparator());
		System.out.println("=====update president if country length is greather than 10 charecter");
		map.forEach((key,value)->{System.out.println("Country:"+ key +"         President name:"+ value);
		if(key.length()>10) {
			map.replace("Malaysia", "uday");
		}
		});
		
		
	}

}
