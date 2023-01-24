package com.xworkz.collections.boot.DTO.listAndset;

import java.util.ArrayList;
import java.util.List;

public class ListRunner {

	public static void main(String[] args) {
		
		List<String> list=new ArrayList<String>();
		list.add("Uday");
		list.add("Ajay");
		list.add("Akash");
		list.add("Ashu");
		list.add("sunil");
		
		list.add(1, "prasanna");
		
		System.out.println(list.size());//5
		list.remove(2);//akash
		list.remove(4);
		System.out.println(list.size());//4
		
		System.out.println(list.get(0));//uday
		System.out.println(list.get(1));//prasanna
		
		for (String string : list) {
			System.out.println(string);
			list.set(2, "praveena");
			list.set(1, "Devi");///uday,devi,praveena,ashu
			
			
			
			
		}
		
		
		

	}

}
