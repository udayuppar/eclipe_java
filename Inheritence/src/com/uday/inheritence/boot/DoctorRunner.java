package com.uday.inheritence.boot;

import com.uday.inheritence.child.Cordiologist;
import com.uday.inheritence.child.Dentist;
import com.uday.inheritence.child.ENT;
import com.uday.inheritence.things.Doctor;

public class DoctorRunner {

	public static void main(String[] args) {

		Doctor docter1 = new Doctor();
		System.out.println(docter1.name);
		System.out.println(docter1.salary);
		
		Doctor doctor2=new Dentist();
		Dentist dent=(Dentist) doctor2;
		System.out.println(dent.dentistName);
		System.out.println(dent.salary);
		System.out.println(dent.name);
		System.out.println(dent.salary);
		System.out.println("*********************");
		
		Doctor doctor3=new ENT();
		ENT ent = (ENT) doctor3;
		System.out.println(ent.feez);
		System.out.println(ent.noOfPatients);
		System.out.println(ent.name);
		System.out.println(ent.salary);
		System.out.println("*********************");
		
		Doctor doctor4=new Cordiologist();
		Cordiologist cordio=(Cordiologist) doctor4;
		System.out.println(cordio.hospitalName);
		System.out.println(cordio.numberOfDocters);
		System.out.println(cordio.name);
		System.out.println(cordio.salary);
		System.out.println("****************");
		
		
		
		

		
		
	
		
	}

}
