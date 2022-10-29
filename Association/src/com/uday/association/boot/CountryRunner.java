package com.uday.association.boot;

import com.uday.association.things.country.City;
import com.uday.association.things.country.Country;
import com.uday.association.things.country.Name;

public class CountryRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Country country  =new Country("India", "Delhi",255);
		country.setCites(null);
		
		Name name=new Name("Hindu","india", null);
		name.display();
		City city=new City("Karnataka", "Bengalur", 31);
		
		Name name1=new Name("Hindustan","Bharatha", null);
		name1.display();
		City city1=new City("India", "Delhi", 25);
		
		City[] cites= {city,city1};
		country.setCites(cites);
		
		country.showOff();
		

	}

}
