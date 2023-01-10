package com.xworkz.springInitialisation.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.springInitialisation.things.Rocket;

@Configuration
@ComponentScan("com.xworkz.springInitialisation.things")
public class SpringConfiguration {

	public SpringConfiguration() {
		System.out.println(" registering SpringConfiguration by default const ");
	}

	@Bean
	public Rocket isro() {
		System.out.println("Registering another Rocket in spring");
		Rocket rocket = new Rocket();
		return rocket;
	}
	
	

}
