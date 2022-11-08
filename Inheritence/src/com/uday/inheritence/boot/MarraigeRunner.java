package com.uday.inheritence.boot;

import com.uday.inheritence.child.ArrangMarraige;

public class MarraigeRunner {

	public static void main(String[] args) {
		
		ArrangMarraige arrang=new ArrangMarraige("Bengalur","Om-weds-mamatha", 500000);
		System.out.println(arrang.vennue);
		System.out.println(arrang.couplesName);
		System.out.println(arrang.noOfRelatives);

	}

}
