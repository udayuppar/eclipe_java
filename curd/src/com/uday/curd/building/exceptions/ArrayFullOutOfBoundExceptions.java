package com.uday.curd.building.exceptions;

public class ArrayFullOutOfBoundExceptions extends RuntimeException {

	public ArrayFullOutOfBoundExceptions() {
		System.out.println("ArrayFullOutOfBoundExceptions");
	}

	public ArrayFullOutOfBoundExceptions(String msg) {
		super(msg);
	}

}
