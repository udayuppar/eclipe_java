package com.uday.questions.things;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int year=2024;
		
		if((year%4==0)&&(year%100!=0)||(year%400==0)) {
			System.out.println("this year is leap year:"+year);
		}else {
			System.out.println("This year is not a leap year");
			
		}

	}

}
