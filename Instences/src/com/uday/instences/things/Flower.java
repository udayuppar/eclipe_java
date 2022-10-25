package com.uday.instences.things;

public class Flower {
	public   final String name="Sunflower";//literal
	public String type;//const
	public double price;// ref
	public int  quantity;//method
	public  static String colour;//static block
	
	public Flower(String name)
	{
		this.type=type;
	}
	
	public void setFlower(){
		this.quantity=20;
		
	}
	static {
		Flower.colour="yellow";
	}
	

	
	public void display() {
		System.out.println(this.type);
		System.out.println(this.name);
		System.out.println(this.price);
		System.out.println(this.quantity);
		System.out.println(Flower.colour);
	}
	
	
	

}
