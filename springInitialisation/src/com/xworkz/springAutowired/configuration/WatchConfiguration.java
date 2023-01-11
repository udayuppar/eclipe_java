package com.xworkz.springAutowired.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.springAutowired")
public class WatchConfiguration {
	
	@Bean
	public String watchName() {
		System.out.println("Registering watchName in spring");
		return "Foxin-5G";
	}
	
	@Bean
	public String watchBrand() {
		System.out.println("Registering watchBrand in spring");
		return "Foxin";
	}
	
	@Bean
	public double watchPrice() {
		System.out.println("Registering watchPrice in spring");
		return 5000d;
	}
	
	@Bean
	public String watchColour() {
		System.out.println("Registering watchColour in spring");
		return "block";
	}
	
	@Bean
	public float weight() {
		System.out.println("Registering weight in spring");
		return 5.2f;
	}

}
