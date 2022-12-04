package com.uday.connection.bridge.Interface.follower;

import com.uday.connection.bridge.Interface.rulls.HospitalRulls;

public class Pateints implements HospitalRulls{

	public boolean maintainSilence() {
		System.out.println("Running maintainSilence");
		return false;
	}

	public boolean smoking() {
		System.out.println("Running smoking");
		return false;
	}

}
