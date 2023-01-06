package com.xworkz.spring.things;

import org.springframework.stereotype.Component;

@Component// is annotation to mark the class has to create an instance
public class Road {
	
	public Road() {
		System.out.println("Configuration of Road......");
	}

}
