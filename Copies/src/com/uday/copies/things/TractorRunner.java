package com.uday.copies.things;
import  com.uday.copies.boot.Tractor;
public class TractorRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tractor tractor=new Tractor();
		System.out.println(tractor.name);
		System.out.println(tractor.brand);
		System.out.println(tractor.colour);
		System.out.println(tractor.hp);
		System.out.println(tractor.price);
		System.out.println(tractor.model);
		System.out.println("*********************");
		
		Tractor tractor2=new Tractor();
		System.out.println(tractor2.name);
		System.out.println(tractor2.brand);
		System.out.println(tractor2.colour);
		System.out.println(tractor2.hp);
		System.out.println(tractor2.price);
		System.out.println(tractor2.model);
		System.out.println("*************************************************");
		
		Tractor tractor3=new Tractor("john deer","john",300000);
		System.out.println(tractor3.name);
		System.out.println(tractor3.brand);
		System.out.println(tractor3.colour);
		System.out.println(tractor3.hp);
		System.out.println(tractor3.price);
		System.out.println(tractor3.model);
		System.out.println("*************************************************");
		
		Tractor tractor4=new Tractor("","john",300000,9);
		System.out.println(tractor4.name);
		System.out.println(tractor4.brand);
		System.out.println(tractor4.colour);
		System.out.println(tractor4.hp);
		System.out.println(tractor4.price);
		System.out.println(tractor4.model);
		System.out.println("*************************************************");
		
		Tractor tractor5=new Tractor("Mahendra12","john deer","john",300000,9);
		System.out.println(tractor5.name);
		System.out.println(tractor5.brand);
		System.out.println(tractor5.colour);
		System.out.println(tractor5.hp);
		System.out.println(tractor5.price);
		System.out.println(tractor5.model);
		System.out.println("*************************************************");
		
		
		Tractor tractor6=new Tractor(5,"mahi","huuu");
		System.out.println(tractor6.name);
		System.out.println(tractor6.brand);
		System.out.println(tractor6.colour);
		System.out.println(tractor6.hp);
		System.out.println(tractor6.price);
		System.out.println(tractor6.model);
		System.out.println("*************************************************");
		
		
		
		
	}

}
