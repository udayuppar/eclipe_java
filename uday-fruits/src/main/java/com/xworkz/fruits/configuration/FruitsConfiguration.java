package com.xworkz.fruits.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.xworkz.fruits")
public class FruitsConfiguration {
	
	public FruitsConfiguration() {
		System.out.println("Create:"+this.getClass().getSimpleName());
	}
	
	@Bean
	public ViewResolver resolver() {
		System.out.println(" Running ViewResolver ");
		return new InternalResourceViewResolver("/", ".jsp");
	}
	
	@Bean
	public LocalEntityManagerFactoryBean  localEntityManagerFactoryBean() {
		System.out.println("Running LocalEntityManagerFactoryBean");
		LocalEntityManagerFactoryBean bean =new LocalEntityManagerFactoryBean();
		return bean;
	}

}
