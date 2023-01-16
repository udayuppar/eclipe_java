package com.xworkz.springDependencyInjection.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FireBox implements Browser {
	
	@Autowired
	@Qualifier("jio")
	private Provider provider;
	@Autowired
	@Qualifier("airtel")
	private Provider provider2;
	
	public FireBox() {
		System.out.println("Creating FireBox in Spring");
	}

	@Override
	public void browse() {
		System.out.println("Creating browser in Spring");
		provider.connect();
		provider2.connect();

	}

}
