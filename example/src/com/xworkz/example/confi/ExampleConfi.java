package com.xworkz.example.confi;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.example.beans.Bike;

@Configuration
@ComponentScan("com.xworkz.example")
public class ExampleConfi {
	 @Bean
	public String name() {
		return "ajay";
	}
	 
	 @Bean
	 public Double price() {
		 return 200d;
	 }
	 @Bean
	 public Bike royal() {
		 return ""; 
	 }

}
