package com.xworkz.springInitialisation.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.springInitialisation.things.Actor;

@Configuration
@ComponentScan("com.xworkz.springInitialisation.things")
public class ActorConfiguration {
	
	@Bean
	public Actor film() {
		Actor actor=new Actor("Rakshith Shetty", "KAnnada",32);
		return actor;
	}
	
	

}
