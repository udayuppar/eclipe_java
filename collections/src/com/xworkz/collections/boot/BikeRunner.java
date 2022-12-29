package com.xworkz.collections.boot;

import java.util.LinkedHashSet;
import java.util.Set;

class BikeRunner {

	public static void main(String[] args) {
		
		String bike1="Royal Enfeild";
		String bike2="KTM";
		String bike3="Duke";
		String bike4="NS-200";
		String bike5="yamaha R-15";
		String bike6="BMW";
		String bike7="Honda CBR";
		String bike8="Kawasaki ninga";
		String bike9="Suzuki GSX";
		String bike10="JAWA";
		String bike11="pulser";
		String bike12="Hero";
		String bike13="honda Shine";
		String bike14="RX-100";
		String bike15="FZ -yamaha";
		String bike16="Discover";
		String bike17="Spender +";
		String bike18="Activa Scooty";
		
		Set<String   > set=new LinkedHashSet<String>();
		set.add(bike1);
		set.add(bike2);
		set.add(bike3);
		set.add(bike4);
		set.add(bike5);
		set.add(bike6);
		set.add(bike7);
		set.add(bike8);
		set.add(bike9);
		set.add(bike10);
		set.add(bike11);
		set.add(bike12);
		set.add(bike13);
		set.add(bike14);
		set.add(bike15);
		set.add(bike16);
		set.add(bike17);
		set.add(bike18);
		
		
		System.out.println(set.add("Uday"));
		
		System.out.println(set.size());
		set.clear();
		
		

	}

}
