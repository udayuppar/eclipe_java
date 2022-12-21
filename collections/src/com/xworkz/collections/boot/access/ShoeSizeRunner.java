package com.xworkz.collections.boot.access;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class ShoeSizeRunner {

	public static void main(String[] args) {
		 int size1=6;
		 int size2=7;
		 int size3=8;
		 int size4=9;
		 int size5=10;
		 int size6=11;
		 int size7=12;
		 int size8=13;
		 int size9=14;
		 int size10=15;
		 int size11=16;
		 int size12=17;
		 int size13=18;
		 int size14=19;
		 int size15=20;
		 
		 Collection<Integer> collection=new HashSet<Integer>();
		 collection.add(size1);
		 collection.add(size2);
		 collection.add(size3);
		 collection.add(size4);
		 collection.add(size5);
		 collection.add(size6);
		 collection.add(size7);
		 collection.add(size8);
		 collection.add(size9);
		 collection.add(size10);
		 collection.add(size11);
		 collection.add(size12);
		 collection.add(size13);
		 collection.add(size14);
		 collection.add(size15);
		 
		 System.out.println(collection.size());
		 System.out.println(collection);
		 System.out.println(System.lineSeparator());
		 
		 System.out.println("----Accessing by forEach loop---------");
		 for(Integer integer : collection) {
			 System.out.println(integer);
		 }
		 System.out.println(System.lineSeparator());
		 
		 System.out.println("----Accessing by Iterator---------");
		 
		 Iterator<Integer> size=collection.iterator();
		 while(size.hasNext()) {
			 Integer looks=size.next();
			 System.out.println(looks);
		 }
		 

	}

}
