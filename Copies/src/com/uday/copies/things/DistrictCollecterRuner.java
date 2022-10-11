package com.uday.copies.things;

import com.uday.copies.boot.DistrictCollecter;

public class DistrictCollecterRuner {

	public static void main(String[] args) {
		
		DistrictCollecter city=new DistrictCollecter();
		System.out.println(city.name);
		System.out.println(city.age);
		System.out.println(city.district);
		System.out.println(city.batchNumber);
		System.out.println("**************");
		
		
		city.name="selvaMani";
		city.age=35;
		city.district="shivamogga";
		city.batchNumber=12;
		System.out.println(city.name);
		System.out.println(city.age);
		System.out.println(city.district);
		System.out.println(city.batchNumber);
	}

}
