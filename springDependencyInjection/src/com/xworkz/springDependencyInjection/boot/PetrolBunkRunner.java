package com.xworkz.springDependencyInjection.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.springDependencyInjection.bean.PetrolBunk;
import com.xworkz.springDependencyInjection.bean.Shell;
import com.xworkz.springDependencyInjection.configuration.PetroleConfiguration;

public class PetrolBunkRunner {

	public static void main(String[] args) {
		
		ApplicationContext container=new AnnotationConfigApplicationContext(PetroleConfiguration.class);
	String[] bean=	container.getBeanDefinitionNames();
	System.out.println(Arrays.toString(bean));
	
	PetrolBunk bunk=container.getBean(Shell.class);
	bunk.purchase();
	//SSystem.out.println(bunk);

	}

}
