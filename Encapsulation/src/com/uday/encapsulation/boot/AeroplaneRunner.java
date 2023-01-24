package com.uday.encapsulation.boot;

import com.uday.encapsulation.things.aeroplane.Aeroplane;
import com.uday.encapsulation.things.aeroplane.AeroplaneModify;

public class AeroplaneRunner {
	public static void main(String[] args) {
		Aeroplane aero=new Aeroplane();
		System.out.println(aero.getName());
		
		AeroplaneModify modify=new AeroplaneModify();
		modify.useAeroplane(aero);
	
	}

}
