package com.xworkz.springInitialisation.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.springInitialisation.configuration.SeasonConfiguration;
import com.xworkz.springInitialisation.things.Season;

public class SeasonRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext spring=new AnnotationConfigApplicationContext(SeasonConfiguration.class);
		String[] beans=spring.getBeanDefinitionNames();
		System.out.println(Arrays.toString(beans));
		
		Season season=spring.getBean("season", Season.class);
		System.out.println(season);
		System.out.println(season.getName());
		System.out.println(season.getDurationInMounth());
		System.out.println(season.getStartingMounth());
		
		Season season2=spring.getBean("weather", Season.class);
		System.out.println(season2);
		System.out.println(season2.getName());
		System.out.println(season2.getDurationInMounth());
		System.out.println(season2.getStartingMounth());

	}

}
