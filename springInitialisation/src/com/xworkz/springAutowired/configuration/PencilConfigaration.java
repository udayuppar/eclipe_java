package com.xworkz.springAutowired.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.springAutowired")
public class PencilConfigaration {
	
	@Bean
	public String pencilName() {
		System.out.println("Registering name in spring");
		return "Nataraja";
	}
	@Bean
	public String type() {
		System.out.println("Registering type in spring");
		return "long";
	}
	@Bean
	public double price() {
		System.out.println("Registering price in spring");
		return 50d;
	}
	@Bean
	public String colour() {
		System.out.println("Registering name in spring");
		return "Red";
	}
	@Bean
	public boolean sharp() {
		System.out.println("Registering name in spring");
		return true;
	}

}
