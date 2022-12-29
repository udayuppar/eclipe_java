package com.xworkz.collections.boot;

import java.util.ArrayList;
import java.util.List;

public class ListRunner {

	public static void main(String[] args) {
		
		List<String> list=new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		
		list.add(1, "U");
		list.add(2,"S");
		
		System.out.println("before remove:"+list.size());
		
		list.remove(2);
		System.out.println("after remove:"+list.size());
		list.set(0, "Z");
		list.get(2);  
		
		
		//System.out.println(list);
		for (String string : list) {
			System.out.println(string);
			//list.get(1);
			//System.out.println(list.get(2));
			
		}
		
		

	}

}
