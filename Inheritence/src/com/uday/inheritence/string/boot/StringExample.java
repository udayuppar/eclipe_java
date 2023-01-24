package com.uday.inheritence.string.boot;

public class StringExample {

	public static void main(String[] args) {
		String reverse="";
		String example="uday";
		 
		//buit in method//
		StringBuffer buffer=new StringBuffer(example);
		System.out.println(buffer.reverse());
		System.out.println(buffer.length());
		System.out.println(System.lineSeparator());
		
		//with out using buit in method//
		for(int i=example.length()-1;i>=0;i--)
		{
			reverse=reverse+example.charAt(i);
		}
		System.out.println("Originsl String:"+example);
		System.out.println("Reverse String:"+reverse);
		
		System.out.println(System.lineSeparator());
		System.out.println("String length:"+example.length());

	}

}
