package com.uday.curd.theater.exceptions;

public class InvalidTypeDateExceptions extends Exception {
	
	public InvalidTypeDateExceptions() {
		System.out.println("InvalidTypeDateExceptions");
	}
	
	public InvalidTypeDateExceptions(String msg) {
		super(msg);
	}
}
