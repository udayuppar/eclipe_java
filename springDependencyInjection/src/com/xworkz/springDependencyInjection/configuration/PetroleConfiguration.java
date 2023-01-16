package com.xworkz.springDependencyInjection.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.springDependencyInjection")
public class PetroleConfiguration {
	
	public PetroleConfiguration() {
		System.out.println("Creating PetroleConfiguration in Spring ");
	}

}
