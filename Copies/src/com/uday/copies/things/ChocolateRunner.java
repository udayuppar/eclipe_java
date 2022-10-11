package com.uday.copies.things;
import com.uday.copies.boot.Chocolate;
public class ChocolateRunner {

	public static void main(String[] args) {
		Chocolate silk=new Chocolate();
		 System.out.println(silk.name);
		 System.out.println(silk.price);
		 System.out.println(silk.brand);
		 System.out.println(silk.flavour);
		 
		 System.out.println("******************");
		 
		 silk.name="dairyMilk";
		 silk.price=250;
		 silk.brand="cadbery";
		 silk.flavour="milk";
		 
		 System.out.println(silk.name);
		 System.out.println(silk.price);
		 System.out.println(silk.brand);
		 System.out.println(silk.flavour);
		 

	}

}
