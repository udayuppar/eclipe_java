package com.uday.connection.bridge.Interface.runner;

import com.uday.connection.bridge.Interface.follower.AirportPassengers;
import com.uday.connection.bridge.Interface.governor.AirportAuthority;

public class AirportAuthorityRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AirportPassengers passenger = new AirportPassengers();
		AirportAuthority authority = new AirportAuthority(passenger);
		authority.check();

	}

}
