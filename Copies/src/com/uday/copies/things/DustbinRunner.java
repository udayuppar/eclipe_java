package com.uday.copies.things;

import com.uday.copies.boot.Dustbin;

public class DustbinRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dustbin useMe=new Dustbin();
		System.out.println(useMe.isFamous);
		System.out.println(useMe.sizeInFeet);
		System.out.println(useMe.capacity);
		System.out.println(useMe.usage);
		System.out.println(useMe.quality);
		System.out.println(useMe.materialName);
		System.out.println(useMe.structure);
		System.out.println(useMe.numberOfHandles);
		System.out.println(useMe.minimumOrderQuantity);
		System.out.println(useMe.name);
		System.out.println(useMe.brand);
		System.out.println(useMe.colour);
		System.out.println(useMe.price);
		System.out.println(useMe.companyName);
		System.out.println(useMe.material);
		System.out.println(useMe.type);
		System.out.println(useMe.weightInKg);
		System.out.println(useMe.usefull);
		
		System.out.println("***************************");
		
		useMe.isFamous=true;
		useMe.sizeInFeet=1;
		useMe.capacity=6;
		useMe.usage="dustbic";
		useMe.quality=true;
		useMe.materialName="dustbic";
		useMe.structure="dustbic";
		useMe.numberOfHandles=1;
		useMe.minimumOrderQuantity=5;
		
		System.out.println(useMe.isFamous);
		System.out.println(useMe.sizeInFeet);
		System.out.println(useMe.capacity);
		System.out.println(useMe.usage);
		System.out.println(useMe.quality);
		System.out.println(useMe.materialName);
		System.out.println(useMe.structure);
		System.out.println(useMe.numberOfHandles);
		System.out.println(useMe.minimumOrderQuantity);
	}

}
