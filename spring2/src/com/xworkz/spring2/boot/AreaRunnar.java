package com.xworkz.spring2.boot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.spring2.configuration.SpringConfiguration;

public class AreaRunnar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext spring = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		String[] beanNames = spring.getBeanDefinitionNames();
		System.out.println(Arrays.toString(beanNames));

		// String ref=spring.getBean(String.class);
		String ref2 = spring.getBean("areaType", String.class);// exception
		System.out.println(ref2.toString());
		
		List<Integer> list=spring.getBean("arrayListValues",ArrayList.class);
		System.out.println(list);
		
		 Map<String, Double> maps=spring.getBean("mapCityAndPincodes",Map.class);
		 System.out.println(maps);
		

	}

}
