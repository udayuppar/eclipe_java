package com.uday.connection.bridge.Interface.governor;

import com.uday.connection.bridge.Interface.follower.AirportPassengers;

public class AirportAuthority {

	private AirportPassengers airport;

	public AirportAuthority() {
		System.out.println("Running Airport Authority");
	}

	public AirportAuthority(AirportPassengers airport) {
		super();
		this.airport = airport;
	}

	public void check() {
		if (airport != null) {
			boolean verification = this.airport.passPostVerification();
			boolean security = this.airport.securityCheck();
			if (verification == false && security == false) {
				System.out.println("passengers are following the rulls");
			} else {
				System.out.println("passengers are not following the rulls");
			}
		}

	}
}
