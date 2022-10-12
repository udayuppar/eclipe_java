package com.uday.copies.things;
import com.uday.copies.boot.Tea;
public class TeaRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tea Tea1=new Tea();
		System.out.println(Tea1.brand);
		System.out.println(Tea1.colour);
		System.out.println(Tea1.price);
		System.out.println(Tea1.teast);
		System.out.println(Tea1.name);
		System.out.println(Tea1.manufacturingDate);
		System.out.println(Tea1.expiryDate);
		System.out.println(Tea1.grams);
		System.out.println(Tea1.type);
		System.out.println(Tea1.fssaiCode);
		System.out.println(Tea1.strongLevel);
		System.out.println(Tea1.quantity);
		System.out.println(Tea1.quality);
		System.out.println(Tea1.incredients);
		System.out.println(Tea1.leafShape);
		System.out.println(Tea1.bradCaster);
		System.out.println(Tea1.aroma);
		
		System.out.println("***************************");
	
		Tea1.type="sugar";
		Tea1.fssaiCode=6579827565l;
		Tea1.strongLevel="high";
		Tea1.quantity="large";
		Tea1.quality=true;
		Tea1.incredients="tulasi";
		Tea1.leafShape="small";
		Tea1.bradCaster="good";
		Tea1.aroma="veryHigh";
		
		System.out.println(Tea1.type);
		System.out.println(Tea1.fssaiCode);
		System.out.println(Tea1.strongLevel);
		System.out.println(Tea1.quantity);
		System.out.println(Tea1.quality);
		System.out.println(Tea1.incredients);
		System.out.println(Tea1.leafShape);
		System.out.println(Tea1.bradCaster);
		System.out.println(Tea1.aroma);
		
	}

}
