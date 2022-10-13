package com.uday.copies.things;
import com.uday.copies.boot.Bread;
public class BreadRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bread bread=new Bread();
		System.out.println(bread.companyName);
		System.out.println(bread.type);
		System.out.println(bread.shape);
		System.out.println(bread.price);
		System.out.println(bread.quantity);
		System.out.println("---------------------------------");
		
		Bread bread2=new Bread("Pound");
		System.out.println(bread2.companyName);
		System.out.println(bread2.type);
		System.out.println(bread2.shape);
		System.out.println(bread2.price);
		System.out.println(bread2.quantity);
		System.out.println("---------------------------------");

		
		Bread bread3=new Bread(50);
		System.out.println(bread3.companyName);
		System.out.println(bread3.type);
		System.out.println(bread3.shape);
		System.out.println(bread3.price);
		System.out.println(bread3.quantity);
		System.out.println("---------------------------------");

		
		Bread bread4=new Bread('S');
		System.out.println(bread4.companyName);
		System.out.println(bread4.type);
		System.out.println(bread4.shape);
		System.out.println(bread4.price);
		System.out.println(bread4.quantity);
		System.out.println("---------------------------------");

		Bread bread5=new Bread("Pound","Rectangular");
		System.out.println(bread5.companyName);
		System.out.println(bread5.type);
		System.out.println(bread5.shape);
		System.out.println(bread5.price);
		System.out.println(bread5.quantity);
		System.out.println("---------------------------------");

		Bread bread6=new Bread("Bun",5);
		System.out.println(bread6.companyName);
		System.out.println(bread6.type);
		System.out.println(bread6.shape);
		System.out.println(bread6.price);
		System.out.println(bread6.quantity);
		System.out.println("---------------------------------");

		Bread bread7=new Bread("Bun",'S');
		System.out.println(bread7.companyName);
		System.out.println(bread7.type);
		System.out.println(bread7.shape);
		System.out.println(bread7.price);
		System.out.println(bread7.quantity);
		System.out.println("---------------------------------");

		Bread bread8=new Bread(50,"Rectangular");
		System.out.println(bread8.companyName);
		System.out.println(bread8.type);
		System.out.println(bread8.shape);
		System.out.println(bread8.price);
		System.out.println(bread8.quantity);
		System.out.println("---------------------------------");


	}

}
