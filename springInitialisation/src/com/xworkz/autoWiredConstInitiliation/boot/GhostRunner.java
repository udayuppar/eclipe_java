package com.xworkz.autoWiredConstInitiliation.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.autoWiredConstInitiliation.beans.Ghost;
import com.xworkz.autoWiredConstInitiliation.beans.Snake;
import com.xworkz.autoWiredConstInitiliation.configuration.GhostConfiguration;
import com.xworkz.autoWiredConstInitiliation.configuration.SnakeConfiguration;

public class GhostRunner {

	public static void main(String[] args) {
		
		ApplicationContext container=new AnnotationConfigApplicationContext(GhostConfiguration.class);
		String[] spring=container.getBeanDefinitionNames();
		System.out.println(Arrays.toString(spring));
		
		Ghost ghost=container.getBean(Ghost.class);
		System.out.println(ghost);


	}

}
