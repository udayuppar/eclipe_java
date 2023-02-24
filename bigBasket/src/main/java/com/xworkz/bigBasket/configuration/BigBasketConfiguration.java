package com.xworkz.bigBasket.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.xworkz.bigBasket")
public class BigBasketConfiguration {
	
	public BigBasketConfiguration() {
		System.out.println("Create:"+this.getClass().getSimpleName());
	}
	
	@Bean
	public ViewResolver resolver() {
		System.out.println("Running ViewResolver in configuration");
		return new InternalResourceViewResolver("/",".jsp");
	}
	
	
	@Bean
	public LocalContainerEntityManagerFactoryBean localContainerEntityManagerFactoryBean() {
		System.out.println("Running LocalContainerEntityManagerFactoryBean");
		LocalContainerEntityManagerFactoryBean bean=new LocalContainerEntityManagerFactoryBean();
		return bean;
	}

}
