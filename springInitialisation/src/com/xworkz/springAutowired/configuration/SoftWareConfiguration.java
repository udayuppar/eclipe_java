package com.xworkz.springAutowired.configuration;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.datetime.joda.LocalDateTimeParser;

@Configuration
@ComponentScan("com.xworkz.springAutowired")
public class SoftWareConfiguration {
	
	@Bean
	public String name() {
		System.out.println("Registering name in spring");
		String ref=new String("Phone Pay");
		return ref;
	}
	
	@Bean
	public int version() {
		System.out.println("Registering version in spring");
		Integer ref=new Integer(5);
		return ref;
	}
	@Bean
	public String developer() {
		System.out.println("Registering developer in spring");
		String ref=new String("Uday");
		return ref;
	}
	
	@Bean
	public LocalDate date() {
		System.out.println("Registering developer in spring");
		
		return LocalDate.of(2023, 1, 10);
	}
	
	@Bean
	public boolean free() {
		return true;
	}
	

}
