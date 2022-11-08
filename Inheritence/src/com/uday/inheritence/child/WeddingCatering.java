package com.uday.inheritence.child;

import com.uday.inheritence.things.Catering;

public class WeddingCatering  extends Catering{

	public WeddingCatering(boolean quality, double quantity, String cateringName) {
		super(quality, quantity, cateringName);
		System.out.println("Catering detailse");
	}

}
