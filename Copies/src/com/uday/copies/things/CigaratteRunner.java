package com.uday.copies.things;
import com.uday.copies.boot.Cigarette;
public class CigaratteRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cigarette tobaco=new Cigarette();
		System.out.println(tobaco.fresher);
		System.out.println(tobaco.chemicals);
		System.out.println(tobaco.origin);
		System.out.println(tobaco.owner);
		System.out.println(tobaco.caffient);
		System.out.println(tobaco.licence);
		System.out.println(tobaco.instantFreshness);
		System.out.println(tobaco.compitator);
		System.out.println(tobaco.isFamous);
		System.out.println(tobaco.brand);
		System.out.println(tobaco.colour);
		System.out.println(tobaco.price);
		System.out.println(tobaco.name);
		System.out.println(tobaco.manufacturingYear);
		System.out.println(tobaco.companyNative);
		System.out.println(tobaco.prohibited);
		System.out.println(tobaco.incredients);
		System.out.println(tobaco.brandAmbassador);
		
		System.out.println("*************************");
		
		tobaco.fresher=false;
		tobaco.chemicals="tobaco";
		tobaco.origin="India";
		tobaco.owner="player";
		tobaco.caffient=false;
		tobaco.licence="no";
		tobaco.instantFreshness=false;
		tobaco.compitator="king";
		tobaco.isFamous=true;
		
		System.out.println(tobaco.fresher);
		System.out.println(tobaco.chemicals);
		System.out.println(tobaco.origin);
		System.out.println(tobaco.owner);
		System.out.println(tobaco.caffient);
		System.out.println(tobaco.licence);
		System.out.println(tobaco.instantFreshness);
		System.out.println(tobaco.compitator);
		System.out.println(tobaco.isFamous);
		
		
		

	}

}
