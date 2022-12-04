package com.uday.connection.bridge.Interface.follower;

import com.uday.connection.bridge.Interface.rulls.BankRules;

public class SBIBank implements BankRules {

	public boolean maintaineMimBalence() {
		System.out.println("running maintaineMimBalence ");
		return true;
	}

	public double balence() {
		System.out.println("running balence");
		return 0;
	}

}
