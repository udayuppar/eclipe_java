package com.uday.connection.bridge.Interface.follower;

import com.uday.connection.bridge.Interface.rulls.MetroRulls;

public class Passenger  implements MetroRulls{

	public String wearAMask() {
		System.out.println("Running Wear a mask");
		return null;
	}

	public boolean smoking() {
		System.out.println("Running Smoking");
		return false;
	}

}
