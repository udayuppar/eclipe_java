package com.uday.curd.building.exceptions;

public class InvalidDataException extends Exception {
	
	public InvalidDataException() {
		System.out.println("InvalidDataException");
	}
	public InvalidDataException(String msg) {
		super (msg);
	}
}
