package com.uday.encapsulation.boot;

import com.uday.encapsulation.things.shoe.Shoe;
import com.uday.encapsulation.things.shoe.ShoeModify;

public class ShoeRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shoe shoo=new Shoe();
		System.out.println(shoo.getName());
		
		ShoeModify modi=new ShoeModify();
		modi.useShoe(shoo);

	}

}
