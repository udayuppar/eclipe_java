package com.uday.connection.runner;

import com.uday.connection.bridge.Soldiers;
import com.uday.connection.rules.Army;

public class ArmyRunner {

	public static void main(String[] args) {
		Army army = new Soldiers();
		army.countryName();
		army.defenceMinisterName();
		army.morningtime();
		army.noOfbounds();
		army.noOfsolderse();

	}

}
