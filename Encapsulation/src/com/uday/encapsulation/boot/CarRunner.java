package com.uday.encapsulation.boot;

import com.uday.encapsulation.things.car.Car;
import com.uday.encapsulation.things.car.CarModifier;

public class CarRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car car = new Car();
		System.out.println(car.getOwerName());
		System.out.println(car.getColour());

		CarModifier modi = new CarModifier();
		modi.useCar(car);

	}

}
