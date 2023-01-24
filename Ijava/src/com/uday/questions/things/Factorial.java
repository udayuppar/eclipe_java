package com.uday.questions.things;

import java.util.Iterator;

public class Factorial {

	public static void main(String[] args) {
		//5*4*3*2*1=120
		int x=5;
		int result=1;
		
		for(int i=x; i>1;i--) {
			result=result*i;
			
		}
		System.out.println("Factorial of:"+x+" is:"+result);
		
		

	}

}
