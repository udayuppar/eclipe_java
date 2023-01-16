package com.xworkz.springDependencyInjection.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Chrome implements Browser {
	
	@Autowired
	@Qualifier("airtel")
	private Provider provider;
	@Autowired
	@Qualifier("jio")
	private Provider provider2;
	
	public Chrome() {
		System.out.println("Creating chrome in const");
	}

	@Override
	public void browse() {
		System.out.println("Creating browser in Spring");
		provider.connect();
		provider2.connect();

	}

}
