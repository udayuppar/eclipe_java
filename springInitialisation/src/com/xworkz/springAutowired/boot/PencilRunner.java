package com.xworkz.springAutowired.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.springAutowired.beans.HardWareShop;
import com.xworkz.springAutowired.beans.Pencil;
import com.xworkz.springAutowired.configuration.HardWareShopConfiguration;

public class PencilRunner {
	public static void main(String[] args) {
		
		ApplicationContext container=new AnnotationConfigApplicationContext(HardWareShopConfiguration.class);
		String[] spring=container.getBeanDefinitionNames();
		System.out.println(Arrays.toString(spring));
		
		Pencil pencil=container.getBean(Pencil.class);
		System.out.println(pencil);
		
	}

}
