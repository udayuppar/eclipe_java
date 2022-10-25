package com.uday.instences.things;

public class Soap {
	
	public    static String brand;
	public final static int expiryDuration=2;
	public int price;
	public String colour;
	
	public Soap(int price, String colour) {
		super();
		this.price = price;
		this.colour = colour;
		
		
	}
	public   void display()
	{
		brand="patangali";
	
		System.out.println(this.price);
		System.out.println(this.colour);
		System.out.println(Soap.brand);
		System.out.println(Soap.expiryDuration);
	} 
	static
	{
		
	}
	
	
	

}
