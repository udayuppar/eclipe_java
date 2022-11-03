package com.uday.encapsulation.boot;

import com.uday.encapsulation.things.ironBox.IronBox;
import com.uday.encapsulation.things.ironBox.IronBoxModify;

public class IronBoxRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IronBox box=new IronBox();
		System.out.println(box.getBrand());
		System.out.println(box.getType());
		
		IronBoxModify modi=new IronBoxModify();
		modi.useIronBox(box);

	}

}
