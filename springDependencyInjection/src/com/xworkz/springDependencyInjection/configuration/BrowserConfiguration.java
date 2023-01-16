package com.xworkz.springDependencyInjection.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.springDependencyInjection")

public class BrowserConfiguration {
	
	public BrowserConfiguration() {
		System.out.println("Creating BrowserConfiguration in Spring ");
	}

}
