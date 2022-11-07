package com.uday.inheritence.child;

import com.uday.inheritence.things.Doctor;

public class Dentist extends Doctor{
	public double salary;
	public String dentistName;

	public Dentist() {
		System.out.println("dentist default const");
	}
}
