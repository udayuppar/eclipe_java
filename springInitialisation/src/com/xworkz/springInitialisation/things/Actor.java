package com.xworkz.springInitialisation.things;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Actor {
	private String name;
	private String language;
	private int age;
	
	// constructer initialisation
	public Actor(@Value("Rishab Shetty") String name, @Value("Kannada") String language,@Value("35")int age) {
		System.out.println("Registering Actor in parameter const in spring");
		this.name=name;
		this.language=language;
		this.age=age;
	}
	
	public String getName() {
		System.out.println("Registering NAme in spring");
		return name;
	}
	
	public String getLanguage() {
		System.out.println("Registering Language in spring");
		return language;
	}
	
	public int getAge() {
		System.out.println("Registering Age in spring");
		return age;
	}
	

}
