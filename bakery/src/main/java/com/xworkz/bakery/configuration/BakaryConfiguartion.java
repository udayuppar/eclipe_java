package com.xworkz.bakery.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.xworkz.bakery")
public class BakaryConfiguartion {
	
	public BakaryConfiguartion() {
		System.out.println("Create:"+this.getClass().getSimpleName());
		
	}
	
	@Bean
	public ViewResolver viewResolver() {
		InternalResourceViewResolver resolver=new InternalResourceViewResolver("/",".jsp");
		return resolver;
	}

}
