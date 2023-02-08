 package com.xworkz.uday.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan("com.xworkz.uday")
public class UdayConfiguration {
	
	public UdayConfiguration() {
		System.out.println("Create:"+this.getClass().getSimpleName());
	}

}
