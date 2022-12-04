package com.uday.connection.bridge.Interface.follower;

import com.uday.connection.bridge.Interface.rulls.AirportRulls;

public class AirportPassengers implements AirportRulls {

	public boolean passPostVerification() {
		System.out.println("running passPost Verification ");
		return false;
	}

	public boolean securityCheck() {
		System.out.println("running security Check");
		return false;
	}

}
