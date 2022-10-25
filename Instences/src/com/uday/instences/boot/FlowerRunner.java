package com.uday.instences.boot;

import com.uday.instences.things.Flower;

public class FlowerRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Flower flower=new Flower("Birthday");
		flower.price=500;
		flower.setFlower();
		flower.display();

	}

}
