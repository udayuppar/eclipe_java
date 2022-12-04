package com.uday.connection.bridge.Interface.follower;

import com.uday.connection.bridge.Interface.rulls.LibraryRulls;

public class Readers  implements LibraryRulls{

	public boolean keepSilence() {
		System.out.println("Running keep silence");
		return false;
	}

	public boolean swichOfTheMobile() {
		System.out.println("Swich of the mobile");
		return false;
	}

}
