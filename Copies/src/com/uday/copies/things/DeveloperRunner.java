package com.uday.copies.things;

import com.uday.copies.boot.Developer;

public class DeveloperRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Developer magician =new Developer();
		System.out.println(magician.name);
		System.out.println(magician.education);
		System.out.println(magician.experience);
		System.out.println(magician.salary);
		System.out.println(magician.company);
		
		System.out.println("***********************");
		magician.name="om";
		magician.education="BE";
		magician.experience=12;
		magician.salary=5000000;
		magician.company="us";
		
		System.out.println(magician.name);
		System.out.println(magician.education);
		System.out.println(magician.experience);
		System.out.println(magician.salary);
		System.out.println(magician.company);
		
		
		

	}

}
