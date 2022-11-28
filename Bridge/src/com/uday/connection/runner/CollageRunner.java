package com.uday.connection.runner;

import com.uday.connection.bridge.CollageRulles;
import com.uday.connection.rules.Collage;

public class CollageRunner {
	public static void main(String[] args) {
		Collage collage = new CollageRulles();
		CollageRulles rulls = new CollageRulles();
		collage.name();
		collage.good();
		collage.noOfStaffs();
		collage.noOfStudent();
		collage.principleName();
		rulls.name();
	}

}
