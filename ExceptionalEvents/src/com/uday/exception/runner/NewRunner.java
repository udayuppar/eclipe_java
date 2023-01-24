package com.uday.exception.runner;

import com.uday.exception.exceptionalEvents.MethodCalling;

public class NewRunner {

	public static void main(String[] args) {
		
		MethodCalling calling =new MethodCalling();
		try{
			System.out.println("calling try block");
			 calling.method5();
			 System.out.println("running try block");
			 
		}
		catch (NullPointerException e) {
			System.out.println("After try block");
		}

	}

}
