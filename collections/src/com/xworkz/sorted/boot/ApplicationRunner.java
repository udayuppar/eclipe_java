package com.xworkz.sorted.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.stream.Collectors;

import com.xworkz.sorted.dto.DtoApplication;

public class ApplicationRunner {

	public static void main(String[] args) {
		
		Collection<DtoApplication> application=new ArrayList<DtoApplication>();
		application.add(new DtoApplication("Instagram", 5, true, "uday", 5000));
		application.add(new DtoApplication("Whats App", 21, false, "Shashi", 2000));
		application.add(new DtoApplication("OLX", 2, true, "Arun", 1000));
		application.add(new DtoApplication("FaceBook", 14, false, "Meta", 2500));
		
		System.out.println(" name is sorted by Asending");
		application.stream().sorted().collect(Collectors.toList()).forEach(e->System.out.println(e));
		
		System.out.println(System.lineSeparator());
		System.out.println("Version is sorted by ascending");
		Comparator<DtoApplication> comparator=(p1,p2)->Double.compare(p1.getVersion(), p2.getVersion());
		application.stream().sorted(comparator).forEach(e->System.out.println(e));
		
		
		System.out.println(System.lineSeparator());
		System.out.println("DevolopedBy is sorted by decending");
		application
		.stream()
		.sorted((p1,p2)->p2.getDevolopedBy().compareTo(p1.getDevolopedBy()))
		.forEach(e->System.out.println(e));

	}

}
