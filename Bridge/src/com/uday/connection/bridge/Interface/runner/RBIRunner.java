package com.uday.connection.bridge.Interface.runner;

import com.uday.connection.bridge.Interface.follower.SBIBank;
import com.uday.connection.bridge.Interface.governor.RBI;
import com.uday.connection.bridge.Interface.rulls.BankRules;

public class RBIRunner {

	public static void main(String[] args) {
		BankRules bank =new SBIBank();
		RBI rbi=new RBI(bank);
		rbi.check();

	}

}
