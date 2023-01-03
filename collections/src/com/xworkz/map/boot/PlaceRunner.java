package com.xworkz.map.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.xworkz.map.dto.ApplicationDto;
import com.xworkz.map.dto.CompanyCEODto;
import com.xworkz.map.dto.DataBaseVenderDto;
import com.xworkz.map.dto.DaughterDto;
import com.xworkz.map.dto.PlaceDto;
import com.xworkz.map.enums.Type;

public class PlaceRunner {

	public static void main(String[] args) {

		Collection<PlaceDto> collections = new ArrayList<PlaceDto>();
		collections.add(new PlaceDto("Mysur Palace", "Mysur", "Jayachamaraja Wadiyar", true, 100));
		collections.add(new PlaceDto("Bengalur Palace", "Bengalur", "KempeGouwda", false, 10));
		collections.add(new PlaceDto("Lalith Palace", "Bengalur", "Raj", false, 50));
		collections.add(new PlaceDto("Mumbai Palace", "Mumbai", "Uday", true, 1000));
		collections.add(new PlaceDto("Shivmogga Palace", "Shivmogga", "Ashu", true, 100));

		System.out.println("Place dto which is not destroyed.........");
		collections.stream().filter(element -> !element.isDestroyedBy()).collect(Collectors.toList())
				.forEach(element -> System.out.println(element));

		System.out.println(System.lineSeparator());
		System.out.println("Location end with r..............");

		collections.stream().filter(element -> element.getLocation().endsWith("r")).collect(Collectors.toList())
				.forEach(element -> System.out.println(element));

		Collection<ApplicationDto> applications = new ArrayList<ApplicationDto>();
		applications.add(new ApplicationDto("Phone Pay", 12, true, "Uday", 10000));
		applications.add(new ApplicationDto("Zomato", 6, true, "google", 20000));
		applications.add(new ApplicationDto("ola", 5, false, "google", 15000));
		applications.add(new ApplicationDto("FLipkart", 8, true, "google", 10000));
		applications.add(new ApplicationDto("Gogle pay", 2, false, "Akash", 12000));

		System.out.println(System.lineSeparator());
		System.out.println("which is free.............");
	//	applications.stream().filter(apps -> apps.isFree())
//				.map(apps -> apps.getDevolopedBy()).collect(Collectors.toList())
//				.forEach(apps -> System.out.println(apps));
		applications.stream().filter(ele->ele.isFree()&&ele.getDevolopedBy()=="google").collect(Collectors.toList())
		.forEach(ele->System.err.println(ele));

		System.out.println(System.lineSeparator());
		System.out.println(" version greater than 5 and print Application name.............");

		applications.stream().filter(apps -> apps.getVersion() > 5).map(name -> name.getName())
				.collect(Collectors.toList()).forEach(name -> System.out.println(name));

		Collection<DataBaseVenderDto> data = new ArrayList<DataBaseVenderDto>();
		data.add(new DataBaseVenderDto("uday", "Shashi", Type.SQL, 2, 100));
		data.add(new DataBaseVenderDto("Akash", "Arun", Type.JAVA, 5, 500));
		data.add(new DataBaseVenderDto("Ajay", "Sandeep", Type.SQL, 2, 50));
		data.add(new DataBaseVenderDto("uday", "Shashi", Type.SQL, 2, 150));
		data.add(new DataBaseVenderDto("Prasanna", "neeraj", Type.WEB_TECHNOLOGIES, 2, 60));

		System.out.println(System.lineSeparator());
		System.out.println("Devoloped by name is Convert Upper case.............");

		data.stream().map(name -> name.getDevolopedBy().toUpperCase()).collect(Collectors.toList())
				.forEach(name -> System.out.println(name));

		System.out.println(System.lineSeparator());
		System.out.println("print the dataBaseVender type.............");

		data.stream().map(name -> name.getType()).collect(Collectors.toList())
				.forEach(name -> System.out.println(name));

		System.out.println(System.lineSeparator());
		System.out.println("DataBaseVender where licence cost is less than 100 and type is SQL.............");

		data.stream().filter(name -> name.getLicenceCost() <= 100).map(name -> name.getType().SQL)
				// .map(name->name.getLicenceCost()>=100 && name.getType().SQL)
				.collect(Collectors.toList()).forEach(name -> System.out.println(name));

		System.out.println(System.lineSeparator());
		System.out.println("Company dto.............");

		Collection<CompanyCEODto> company = new ArrayList<CompanyCEODto>();
		DaughterDto daughterDto = new DaughterDto("Ashu", 8861539422l, 24, true, true);
		company.add(new CompanyCEODto("Rathan Tata", "TCS", 60, "India", "B.E", true, daughterDto));
		company.add(new CompanyCEODto("Narayana murthi","Infosys", 50, "India", "B.E", true, daughterDto));
		company.add(new CompanyCEODto("Sundar Pichai","Google", 45, "India", "B.E", false, daughterDto));
		company.add(new CompanyCEODto("Arvind Krishna","IBM", 49, "India", "B.E", true, daughterDto));
		
		company.stream().map(ele->ele.getDaughterdto())
		.forEach(e->System.out.println(e));
	}

}
