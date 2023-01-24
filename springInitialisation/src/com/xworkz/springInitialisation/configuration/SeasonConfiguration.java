package com.xworkz.springInitialisation.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.springInitialisation.things.Season;

@Configuration
@ComponentScan("com.xworkz.springInitialisation.things")
public class SeasonConfiguration {
	
	
	
	@Bean("temp")
	public Season temp() {
		Season season2=new Season();
		season2.setDurationInMounth(5);
		season2.setName("mansoon");
		season2.setStartingMounth("Janavary");
		return season2;
	}
	
	@Bean("weather")
	public Season weather() {
		Season season=new Season();
		season.setName("Summer");
		season.setDurationInMounth(4);
		season.setStartingMounth("March");
		return season;
		
		
		
		
	}
	

}
