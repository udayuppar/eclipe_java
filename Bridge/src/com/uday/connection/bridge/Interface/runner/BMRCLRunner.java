package com.uday.connection.bridge.Interface.runner;

import com.uday.connection.bridge.Interface.follower.Passenger;
import com.uday.connection.bridge.Interface.governor.BMRCL;

public class BMRCLRunner {

	public static void main(String[] args) {
		Passenger passenger=new Passenger();
		BMRCL bmrcl=new BMRCL(passenger);
		bmrcl.metro();

	}

}
