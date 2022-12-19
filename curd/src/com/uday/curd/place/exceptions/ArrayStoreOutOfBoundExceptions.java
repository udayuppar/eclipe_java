package com.uday.curd.place.exceptions;

public class ArrayStoreOutOfBoundExceptions extends RuntimeException {
	
	public ArrayStoreOutOfBoundExceptions() {
		System.out.println("ArrayStoreOutOfBoundExceptions");
	}
	
	public ArrayStoreOutOfBoundExceptions(String msg) {
		super(msg);
	
	}
}
