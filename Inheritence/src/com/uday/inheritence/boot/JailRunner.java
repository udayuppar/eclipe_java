package com.uday.inheritence.boot;

import com.uday.inheritence.child.jail.*;

import com.uday.inheritence.things.Jail;

public class JailRunner {

	public static void main(String[] args) {
		
		Juvenile  juve=new Juvenile();
		System.out.println(juve.jailarName);
		System.out.println(juve.noOfOfficers);
		System.out.println(juve.jailName);
		System.out.println(juve.location);
		System.out.println(System.lineSeparator());
		 
		Jail jail=new Jail();
		System.out.println(jail.jailName);
		System.out.println(jail.location);
		
		Jail jail2=new Juvenile();
		Juvenile criminals=(Juvenile) jail2;
		System.out.println(criminals.jailarName);
		System.out.println(criminals.noOfOfficers);
		System.out.println(criminals.jailName);
		System.out.println(criminals.location);
		System.out.println(System.lineSeparator());
		
		Jail jail3=new HighSecurity();
		HighSecurity high=(HighSecurity) jail3;
		System.out.println(high.noOfCells);
		System.out.println(high.noOfCriminals);
		System.out.println(high.jailName);
		System.out.println(high.location);
		System.out.println(System.lineSeparator());
		
		Jail jail4=new MediumSecurity();
		MediumSecurity medium=(MediumSecurity) jail4;
		System.out.println(medium.foodQuality);
		System.out.println(medium.officerSalary);
		System.out.println(medium.jailName);
		System.out.println(medium.location);
		System.out.println(System.lineSeparator());

	}

}
