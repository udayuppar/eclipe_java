package com.uday.questions.boot;

import java.util.ArrayList;
import java.util.Collection;

public class Sorted {
	
	public static void main(String[] args) {
		
		//int[] arr=new int[] {1,2,3,4,5};
		
		Collection<Integer> collection=new ArrayList<Integer>();
		collection.add(1);
		collection.add(6);
		collection.add(3);
		collection.add(2);
		collection.add(5);
		
		
		collection.stream().sorted((a1,a2)->a1.compareTo(a2)).forEach(e->System.out.println(e));
		/*for (int integer : arr) {
			collection.add(integer);
			
			System.out.println(collection);
			
		}*/
	}

}
