package com.xworkz.springAutowired.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.springAutowired.beans.HardWareShop;

@Configuration
@ComponentScan("com.xworkz.springAutowired")
public class HardWareShopConfiguration {
	
	@Bean
	public int ShopId() {
		System.out.println("Registering ShopId in SPring");
		Integer ref=new Integer(10);
		return ref;
		
	}
	
	@Bean
	public String shopName() {
		System.out.println("Registering Shop name in SPring");
		String ref=new String("Sapthagiri");
		return ref;
	}
	
	@Bean
	public double gstNumber() {
		System.out.println("Registering Shop name in SPring");
		Double ref=new Double(24561395d);
		return ref;
		
	}
	
	@Bean
	public String ownerName() {
		System.out.println("Registering owner name in SPring");
		String ref=new String("Uday");
		return ref;
		
	}
	
	@Bean
	public String location() {
		System.out.println("Registering location name in SPring");
		String ref=new String("Tarikere");
		return ref;
		
	}
	
	
	

}
