package com.uday.inheritence.boot;

import com.uday.inheritence.child.WeddingCatering;

public class CateringRunner {

	public static void main(String[] args) {
		
		WeddingCatering wedding =new WeddingCatering(false, 500,"Annaporneshwary");
		System.out.println("Catering detailse");
		System.out.println(wedding.cateringName);
		System.out.println(wedding.quality);
		System.out.println(wedding.quantity);

	}

}
