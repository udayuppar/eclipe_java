package com.uday.connection.runner;

import com.uday.connection.bridge.MedicalUser;
import com.uday.connection.rules.Medical;

public class MedicalRunner {

	public static void main(String[] args) {
		Medical medical=new MedicalUser();
		medical.godForHelth();
		medical.location();
		medical.name();
		medical.ownerName();
		medical.shopNumber();

	}

}
