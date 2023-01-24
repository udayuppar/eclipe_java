package com.xworkz.example.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.example.beans.Example;
import com.xworkz.example.confi.ExampleConfi;

public class ExampleRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext container=new AnnotationConfigApplicationContext(ExampleConfi.class);
		String[] bean=container.getBeanDefinitionNames();
		System.out.println(Arrays.toString(bean));
		
		Example ex=container.getBean(Example.class);
		System.out.println(ex);

	}

}
