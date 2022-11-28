package com.uday.connection.runner;

import com.uday.connection.child.CarRidder;
import com.uday.connection.rules.Car;

public class CarRunner {

	public static void main(String[] args) {
		Car car = new CarRidder();
		car.good();
		car.name();
		car.ownerName();
		car.price();
		car.sequrity();

	}

}
