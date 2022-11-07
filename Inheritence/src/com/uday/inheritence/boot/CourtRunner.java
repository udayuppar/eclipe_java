package com.uday.inheritence.boot;

import com.uday.inheritence.child.court.DistrictCourt;
import com.uday.inheritence.child.court.HighCourt;
import com.uday.inheritence.child.court.SupremCourt;
import com.uday.inheritence.things.Court;

public class CourtRunner {

	public static void main(String[] args) {
		
		
		Court court=new Court();
		System.out.println(court.judgeName);
		System.out.println(court.name);
		System.out.println(System.lineSeparator());
		
		Court court2=new SupremCourt();
		SupremCourt court3=(SupremCourt) court2;
		System.out.println(court3.location);
		System.out.println(court3.noOfLawyer);
		System.out.println(court3.judgeName);
		System.out.println(court3.name);
		System.out.println(System.lineSeparator());
		
		Court court4=new HighCourt();
		HighCourt high=(HighCourt) court4;
		System.out.println(high.highCourtJudgeName);
		System.out.println(high.salary);
		System.out.println(high.judgeName);
		System.out.println(high.name);
		System.out.println(System.lineSeparator());
		
		Court court5=new DistrictCourt();
		DistrictCourt dist=(DistrictCourt) court5;
		System.out.println(dist.courtName);
		System.out.println(dist.government);
		System.out.println(dist.judgeName);
		System.out.println(dist.name);
	}

}
