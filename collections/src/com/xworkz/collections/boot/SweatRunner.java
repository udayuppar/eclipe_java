package com.xworkz.collections.boot;

import java.util.ArrayList;
import java.util.Collection;

public class SweatRunner {

	public static void main(String[] args) {
		 String sweat1="Jamoon";
		 String sweat2="Peeda";
		 String sweat3="Jelebi";
		 String sweat4="Payasam";
		 String sweat5="Rasmalai";
		 String sweat6="Ghevar";
		 String sweat7="Rasgulla";
		 String sweat8="Ladoo";
		 String sweat9="Kulfi";
		 String sweat10="Basundi";
		 String sweat11="Khaja";
		 String sweat12="Badam Ka Halwa";
		 String sweat13="Mysore Pak";
		 
		 Collection<String> collection=new ArrayList();
		 collection.add(sweat1);
		 collection.add(sweat2);
		 collection.add(sweat3);
		 collection.add(sweat4);
		 collection.add(sweat5);
		 collection.add(sweat6);
		 collection.add(sweat7);
		 collection.add(sweat8);
		 collection.add(sweat9);
		 collection.add(sweat10);
		 collection.add(sweat11);
		 collection.add(sweat12);
		 collection.add(sweat13);
		// System.out.println(collection.add(sweat13));
		 System.out.println(collection.size());
		 
		 collection.clear();
		 System.out.println("After clear......");
		 
		 System.out.println(collection.size());
		 



		 

	}

}
