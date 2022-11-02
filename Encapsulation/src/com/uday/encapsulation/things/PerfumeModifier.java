package com.uday.encapsulation.things;

public class PerfumeModifier {

	public void usePerfume(Perfume perfume) {
		System.out.println(" access perfume brand:" + perfume.getbrand());
		perfume.setBrand("Foog");
		System.out.println(" modifing perfume brand:" + perfume.getbrand());
		System.out.println("perfume fragnence :" + perfume.fragnence);
		System.out.println("perfume price :" + perfume.price);
		System.out.println("perfume mfd  :" + perfume.mfd);
		System.out.println("perfume expd :" + perfume.expd);
		System.out.println("perfume manufacteringCountry :" + perfume.manufacteringCountry);
		System.out.println("perfume idealFor :" + perfume.idealFor);
		System.out.println("perfume quantity :" + perfume.quantity);
		System.out.println("perfume rating :" + perfume.rating);
		System.out.println("perfume colour :" + perfume.colour);
		System.out.println("perfume quality :" + perfume.quality);

	}
}
