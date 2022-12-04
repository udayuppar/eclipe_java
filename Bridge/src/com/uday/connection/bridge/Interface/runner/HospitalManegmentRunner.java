package com.uday.connection.bridge.Interface.runner;

import com.uday.connection.bridge.Interface.follower.Pateints;
import com.uday.connection.bridge.Interface.governor.HospitalManagment;

public class HospitalManegmentRunner {

	public static void main(String[] args) {
		 Pateints pateints=new Pateints();
		 HospitalManagment managment=new HospitalManagment(pateints);
		 managment.check();

	}

}
