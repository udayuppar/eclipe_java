package com.uday.exception.exceptionalEvents;



public class MethodCalling {
	
	public void method1() {
		method2();
	}
	public void method2() {
		method3();
	}
	public void method3() {
	method4();
	}
	public void method4() {
		method5();
	}
	public void method5() {
		System.out.println("before exception");
		throw new NullPointerException();
	}

	

}
