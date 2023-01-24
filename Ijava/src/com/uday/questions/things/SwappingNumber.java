package com.uday.questions.things;

public class SwappingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=10;
		int y=20;
		
		System.out.println("Before Swapping");
		System.out.println("X = "+x);
		System.out.println("Y = "+y);
		
		int temp=x;
		x=y;
		y=temp;
		System.out.println("After swapping");
		System.out.println("X = "+x);
		System.out.println("Y =  "+y);
		
		System.out.println(System.lineSeparator());
		int a=10;
		int b=20;
		System.out.println("Before Swapping without using extra variable");
		System.out.println("A = "+a);
		System.out.println("b = "+b);
		
		a=a+b;//10+20=30
		b=a-b;//30-20=10=b
		a=a-b;//30-10=20=a
		
		System.out.println("After swapping");
		System.out.println("A = "+a);
		System.out.println("B =  "+b);
		
		
		
		
		

	}

}
