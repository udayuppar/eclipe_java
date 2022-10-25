package com.uday.instences.things;

public class Crackers {
	
	public  final String  brand="Standard";//literal
	public String name;//const
	public double price;// ref
	public int  quantity;//method
	public  static String colour;//static block
	
	public Crackers(String name)
	{
		this.name=name;
	}
	
	public void setCrackers(){
		this.quantity=20;
		
	}
	static {
		Crackers.colour="block";
	}
	

	
	public void display() {
		System.out.println(this.brand);
		System.out.println(this.name);
		System.out.println(this.price);
		System.out.println(this.quantity);
		System.out.println(Crackers.colour);
	}

	

}
