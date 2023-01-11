package com.xworkz.springAutowired.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.springAutowired")
public class RubberConfiguration {
	
	@Bean
	public String rubberName() {
		System.out.println("Registering rubberName in spring");
		return "Apsara";
	}
	
	@Bean
	public String rubberType() {
		System.out.println("Registering rubberType in spring");
		return "Erase";
	}
	@Bean
	public double rubberPrice() {
		System.out.println("Registering price in spring");
		return 20;
	}
	@Bean
	public String rubberColour() {
		System.out.println("Registering rubberColour in spring");
		return "White";
	}
	@Bean
	public String rubberShape() {
		System.out.println("Registering rubberShape in spring");
		return "Rectangle";
	}
	@Bean
	public String size() {
		System.out.println("Registering size in spring");
		return "Small";
	}
	

}
