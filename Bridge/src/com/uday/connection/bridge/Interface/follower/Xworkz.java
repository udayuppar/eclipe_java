package com.uday.connection.bridge.Interface.follower;

import com.uday.connection.bridge.Interface.rulls.DevolopmentInstritute;
import com.uday.connection.bridge.Interface.rulls.Instritute;
import com.uday.connection.bridge.Interface.rulls.TestingInstritute;
import com.uday.connection.bridge.Interface.rulls.TrafficRulls;


public class Xworkz implements Instritute,DevolopmentInstritute,TestingInstritute,TrafficRulls {

	public boolean training() {
		System.out.println("running training");
		return false;
	}

	public boolean placement() {
		System.out.println("running placement");
		return false;
	}

	public boolean interview() {
		System.out.println("running interview");
		return false;
	}

	public int wearHelmet() {
		System.out.println("running wearHelmet");
		return 0;
	}

	public double tripleRidding() {
		System.out.println("running tripleRidding");
		return 0;
	}

	

}
