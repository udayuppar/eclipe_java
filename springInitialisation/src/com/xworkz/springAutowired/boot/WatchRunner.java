package com.xworkz.springAutowired.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.springAutowired.beans.Rubber;
import com.xworkz.springAutowired.beans.SmartWatch;
import com.xworkz.springAutowired.configuration.HardWareShopConfiguration;

public class WatchRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext container=new AnnotationConfigApplicationContext(HardWareShopConfiguration.class);
		String[] spring=container.getBeanDefinitionNames();
		System.out.println(Arrays.toString(spring));
		
		SmartWatch shop=container.getBean(SmartWatch.class);
		System.out.println(shop);

	}

}
