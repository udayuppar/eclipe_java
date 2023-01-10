package com.xworkz.springInitialisation.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.springInitialisation.configuration.SpringConfiguration;
import com.xworkz.springInitialisation.things.Rocket;

public class RocketRunner {

	public static void main(String[] args) {
	
		
		ApplicationContext spring=new AnnotationConfigApplicationContext(SpringConfiguration.class);
		 String[] beans=spring.getBeanDefinitionNames();
		 System.out.println(Arrays.toString(beans));
		 Rocket rocket=spring.getBean("rocket",Rocket.class);
		 System.out.println(rocket);
		System.out.println(rocket.getBudget());
		System.out.println(rocket.getCountry());
		System.out.println(rocket.getName());
		
		Rocket rocket2=spring.getBean("isro",Rocket.class);
		System.out.println(rocket2);
		System.out.println(rocket2.getBudget());
		System.out.println(rocket2.getCountry());
		System.out.println(rocket2.getName());
		
		
		 
		 

	}

}
