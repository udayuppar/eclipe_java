package com.uday.questions.boot;

import java.util.Scanner;

public class CouponCode {

	public static void main(String[] args) 
	
	{
		int count=0;
		Scanner scan=new Scanner(System.in);
		String coupon=scan.next();
		
		String str1=coupon.substring(0,2);
		System.out.println(str1);
		
		String str2=coupon.substring(2,6);
		System.out.println(str2);
		
		String str3=coupon.substring(6,9);
		System.out.println(str3);
		
		int convertString=Integer.parseInt(str2);
		int convertString2=Integer.valueOf(str2);
		System.out.println("convert string to number:"+convertString2);
		
		if(coupon.length()==9 && convertString2==2022)
		{
			if(str3.charAt(str3.length()-1)>='A' && str3.charAt(str3.length()-1)<='Z'){
				if(str1.charAt(0)>='A' && str1.charAt(0)<='Z') {
					count ++;
				}
			}
					
			
		}
		if(count==0) {
			System.out.println("invalid coupon");
		}else {
			System.out.println("valid coupon");
		}
	}

}
