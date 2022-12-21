package com.xworkz.collections.boot.access;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class SoftWareCompanyNameRunner {

	public static void main(String[] args) {
		
		String company1="Google";
		String company2="Oracle";
		String company3="IBM";
		String company4="Infosys";
		String company5="Wipro";
		String company6="TCS";
		String company7="Deloite";
		String company8="Think core";
		String company9="Capgeminy";
		String company10="Tech Mahendra";
		String company11="Infotech";
		String company12="Bosch";
		String company13="Accuvate";
		String company14="Kreeti technologies";
		String company15="First America";
		String company16="Accuvare";
		String company17="Amezon";
		String company18="Microsoft";
		String company19="Mu sigma";
		String company20="Sony";
		
		Collection<String> softWare=new ArrayList<String>();
		softWare.add(company1);
		softWare.add(company2);
		softWare.add(company3);
		softWare.add(company4);
		softWare.add(company5);
		softWare.add(company6);
		softWare.add(company7);
		softWare.add(company8);
		softWare.add(company9);
		softWare.add(company10);
		softWare.add(company11);
		softWare.add(company12);
		softWare.add(company13);
		softWare.add(company14);
		softWare.add(company15);
		softWare.add(company16);
		softWare.add(company17);
		softWare.add(company18);
		softWare.add(company19);
		softWare.add(company20);

		
		System.out.println(softWare.size());
		System.out.println(softWare);
		System.out.println(System.lineSeparator());
		
		System.out.println("/////////-for each method--//////////");
		for(String company  : softWare) {
			System.out.println(company);
		}
		
		System.out.println(System.lineSeparator());
		System.out.println("/////////-Iterator method--//////////");
		
		Iterator<String> it=softWare.iterator();
		while(it.hasNext()) {
			String name=it.next();
			System.out.println(name);
		}
	}

}
