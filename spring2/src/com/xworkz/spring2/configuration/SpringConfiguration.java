package com.xworkz.spring2.configuration;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.spring2.things")
public class SpringConfiguration {

	@Bean("areaName")
	public String areaName() {
		System.out.println("Registering  AreaName with Spring");
		String string = new String();
		return string;
	}

	@Bean("areaType")
	public String areaType() {
		System.out.println("Registering  areaType with Spring");
		String string = new String();
		return string;
	}

	@Bean("collageName")
	public String collageName() {
		System.out.println("Registering  collageName with Spring");
		String string = new String();
		return string;
	}

	@Bean("schoolName")
	public String schoolName() {
		System.out.println("Registering  schoolName with Spring");
		String string = new String();
		return string;
	}

	@Bean("mLAName")
	public String mLAName() {
		System.out.println("Registering  mLAName with Spring");
		String string = new String();
		return string;
	}

	@Bean("isGood")
	public Boolean isGood() {
		System.out.println("Registering  isGood with Spring");
		Boolean good = new Boolean(false);
		return good;

	}

	@Bean("isBad")
	public Boolean isBad() {
		System.out.println("Registering  isBad with Spring");
		Boolean good = new Boolean(false);
		return good;

	}

	@Bean("areaIsClean")
	public Boolean areaIsClean() {
		System.out.println("Registering  areaIsClean with Spring");
		Boolean good = new Boolean(false);
		return good;

	}

	@Bean("mLAIsGood")
	public Boolean mLAIsGood() {
		System.out.println("Registering  mLAIsGood with Spring");
		Boolean good = new Boolean(false);
		return good;

	}

	@Bean("famousArea")
	public Boolean famousArea() {
		System.out.println("Registering  famousArea with Spring");
		Boolean good = new Boolean(false);
		return good;

	}

	@Bean("wardNumber")
	public Double wardNumber() {
		System.out.println("Registering  isGood with Spring");
		Double value = new Double(545);
		return value;
	}

	@Bean("noOfCivigians")
	public Double noOfCivigians() {
		System.out.println("Registering  noOfCivigians with Spring");
		Double value = new Double(52545);
		return value;
	}

	@Bean("noOHouse")
	public Double noOHouse() {
		System.out.println("Registering  noOHouse with Spring");
		Double value = new Double(545);
		return value;
	}

	@Bean("noOfBusStop")
	public Double noOfBusStop() {
		System.out.println("Registering  noOfBusStop with Spring");
		Double value = new Double(35);
		return value;
	}

	@Bean("noOfShops")
	public Double noOfShops() {
		System.out.println("Registering  noOfShops with Spring");
		Double value = new Double(55);
		return value;
	}

	@Bean("bufferAreaName")
	public StringBuffer bufferAreaName() {
		System.out.println("Registering  bufferAreaName with Spring");
		StringBuffer buffer = new StringBuffer();
		return buffer;
	}

	@Bean("bufferAreaType")
	public StringBuffer bufferAreaType() {
		System.out.println("Registering  bufferAreaType with Spring");
		StringBuffer buffer = new StringBuffer();
		return buffer;
	}

	@Bean("bufferPrimarySchoolName")
	public StringBuffer bufferPrimarySchoolName() {
		System.out.println("Registering  bufferPrimarySchoolName with Spring");
		StringBuffer buffer = new StringBuffer();
		return buffer;
	}

	@Bean("bufferCornvent")
	public StringBuffer bufferCornvent() {
		System.out.println("Registering  bufferCornvent with Spring");
		StringBuffer buffer = new StringBuffer();
		return buffer;
	}

	@Bean("bufferDegreeCollge")
	public StringBuffer bufferDegreeCollge() {
		System.out.println("Registering  bufferDegreeCollge with Spring");
		StringBuffer buffer = new StringBuffer();
		return buffer;
	}

	@Bean("builderName")
	public StringBuilder builderName() {
		System.out.println("Registering  bufferDegreeCollge with Spring");
		StringBuilder builder = new StringBuilder();
		return builder;
	}

	@Bean("builderDegreeCollage")
	public StringBuilder builderDegreeCollage() {
		System.out.println("Registering  builderDegreeCollage with Spring");
		StringBuilder builder = new StringBuilder();
		return builder;
	}

	@Bean("builderHousename")
	public StringBuilder builderHousename() {
		System.out.println("Registering  builderHousename with Spring");
		StringBuilder builder = new StringBuilder();
		return builder;
	}

	@Bean("buildeMlAName")
	public StringBuilder buildeMlAName() {
		System.out.println("Registering  buildeMlAName with Spring");
		StringBuilder builder = new StringBuilder();
		return builder;
	}

	@Bean("builderSchool")
	public StringBuilder builderSchool() {
		System.out.println("Registering  builderSchool with Spring");
		StringBuilder builder = new StringBuilder();
		return builder;
	}

	@Bean("arrayListValues")
	public ArrayList arrayList() {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		//System.out.println(list);
		return (ArrayList) list;
	}
	
	@Bean("mapCityAndPincodes")
	public Map pincodes() {
		Map<String, Double> map = new HashMap<String, Double>();
		map.put("Mandya", 541326d);
		map.put("Mysore", 578620d);
		map.put("Hubli", 572201d);
		map.put("Davangere", 515151d);
		map.put("Hosadurga", 577527d);
		//System.out.println(map);
		return map;
	}
	
}
