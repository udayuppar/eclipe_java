package com.uday.encapsulation.things.car;

public class CarModifier {
	public void useCar(Car car)
	{
		System.out.println("Access the car ower name:" + car.getOwerName());
		car.setOwerName("Ajay");
		System.out.println(" modifing car ower name:" + car.getOwerName());
		System.out.println("Access the car colour:" + car.getColour());
		car.setColour("Red");
		System.out.println(" modifing car colour:" + car.getColour());
		System.out.println("car name:"+car.name);
		System.out.println("car wightInKg:"+car.wightInKg);
		System.out.println("car brand:"+car.brand);
		System.out.println("car price:"+car.price);
		System.out.println("car millage:"+car.millage);
		System.out.println("car model:"+car.model);
		System.out.println("car fuelTankCapacity:"+car.fuelTankCapacity);
		System.out.println("car deliveryDate:"+car.deliveryDate);
		System.out.println("car noOfTyre:"+car.noOfTyre);
	}

}
