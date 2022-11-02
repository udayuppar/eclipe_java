package com.uday.encapsulation.things.bike;

public class BikeModifier {
	public void useBike(Bike bike) {
		System.out.println("Access the bike name:" + bike.getName());
		bike.setName("KTM");
		System.out.println(" modifing bike name:" + bike.getName());
		System.out.println("Access the bike colour:" + bike.getColour());
		bike.setColour("Orange");
		System.out.println("modifing bike colour:" + bike.getColour());
		System.out.println("bike ower name:" + bike.owerName);
		System.out.println("bike wightInKg:" + bike.wightInKg);
		System.out.println("bike brand:" + bike.brand);
		System.out.println("bike price:" + bike.price);
		System.out.println("bike millage:" + bike.millage);
		System.out.println("bike model:" + bike.model);
		System.out.println("bike fuelTankCapacity:" + bike.fuelTankCapacity);
		System.out.println("bike deliveryDate:" + bike.deliveryDate);
		System.out.println("bike noOfTyre:" + bike.noOfTyre);

	}

}
