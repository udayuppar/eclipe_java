package com.xworkz.lambda.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

import com.xworkz.lambda.Functional;
import com.xworkz.lambda.FunctionalImpl;

public class FunctionalRunner {

	public static void main(String[] args) {
		
		//class imlp
		System.out.println("===========Using class impl===========");
		Functional lambda1=new FunctionalImpl();
		lambda1.save(10, 14);
		
		System.out.println("=============using lambda exprestion impl  ===========");
		Functional ref=(a1,a2)->{
			System.out.println("ref:"+a1);
			System.out.println("ref:"+a2);
			return false;
			
		};
		ref.save(10, 100);
		
		//impl using collection
		System.out.println("==========using Collection impl===================");
		
		Collection<Integer> collection=new ArrayList<Integer>();
		collection.add(10);
		collection.add(15);
		collection.add(20);
		
		/*Consumer<Integer> number=(n)->{
			System.out.println(n);
		};
		collection.forEach(number);*/
		
		collection.forEach((n)->{
			System.out.println(n);
		});
		

	}

}
