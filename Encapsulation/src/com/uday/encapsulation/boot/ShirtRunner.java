package com.uday.encapsulation.boot;

import com.uday.encapsulation.things.shirt.Shirt;
import com.uday.encapsulation.things.shirt.ShirtModify;

public class ShirtRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shirt shirt=new Shirt();
		System.out.println(shirt.getName());
		System.out.println(shirt.getType());
		
		ShirtModify modi=new ShirtModify();
		modi.useShirt(shirt);

	}

}
