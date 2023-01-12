package com.xworkz.autoWiredConstInitiliation.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.xworkz.autoWiredConstInitiliation.beans.Snake;

import com.xworkz.autoWiredConstInitiliation.configuration.SnakeConfiguration;

public class SnakeRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext container=new AnnotationConfigApplicationContext(SnakeConfiguration.class);
		String[] spring=container.getBeanDefinitionNames();
		System.out.println(Arrays.toString(spring));
		
		Snake snake=container.getBean(Snake.class);
		System.out.println(snake);

	}

}
