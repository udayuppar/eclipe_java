package com.uday.encapsulation.boot;

import com.uday.encapsulation.things.bag.Bag;
import com.uday.encapsulation.things.bag.BagModify;

public class BagRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bag bag=new Bag();
		System.out.println(bag.getBrand());
		System.out.println(bag.getType());
		
		BagModify  modify = new BagModify();
		modify.useBag(bag);

	}

}
