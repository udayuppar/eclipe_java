package com.uday.copies.things;

public class Bike {
	
	public String name;
	public String owenName;
	public boolean working;
	public boolean headlight;
	public int millage;
	public int noOfIndicater;
	public String[] brand;
	public String[] colour;
	public double[] price;
	public String[] tireName;
	
	public Bike(String name,String owenName,boolean working,boolean headlight,int millage,int noOfIndicater,String[] brand,String[] colour,double[] price,String[] tireName)
	{
		this.name=name;
		this.owenName=owenName;
		this.working=working;
		this.headlight=headlight;
		this.millage=millage;
		this.noOfIndicater=noOfIndicater;
		this.brand=brand;
		this.colour=colour;
		this.price=price;
		this.tireName=tireName;
	}
	
	public void print()
	{
		System.out.println(this.name);
		System.out.println(this.owenName);
		System.out.println(this.working);
		System.out.println(this.headlight);
		System.out.println(this.millage);
		System.out.println(this.noOfIndicater);
		System.out.println("**************************************");
		System.out.println("brand name");
		System.out.println("**************************************");
		for (int i = 0; i < brand.length; i++) {
			String string = brand[i];
			System.out.println(string);
			
		}
		System.out.println("**************************************");
		System.out.println("colour");
		System.out.println("**************************************");
		for (int i = 0; i < colour.length; i++) {
			String string = colour[i];
			System.out.println(string);
			
		}
		System.out.println("**************************************");
		System.out.println("bike price");
		System.out.println("**************************************");
		for (int i = 0; i < price.length; i++) {
			double string = price[i];
			System.out.println(string);
			
		}
		System.out.println("**************************************");
		System.out.println("tire name");
		System.out.println("**************************************");
		for (int i = 0; i < tireName.length; i++) {
			String string = tireName[i];
			System.out.println(string);
			
		}
	}
	
	

}
