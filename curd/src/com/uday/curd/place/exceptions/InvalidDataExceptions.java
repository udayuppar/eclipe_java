package com.uday.curd.place.exceptions;

public class InvalidDataExceptions extends Exception {
	
	public InvalidDataExceptions() {
		System.out.println("InvalidDataExceptions");
	}
	
	public InvalidDataExceptions(String msg) {
		super(msg);
		
	}
}
