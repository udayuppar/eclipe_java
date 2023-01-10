package com.xworkz.springInitialisation.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.springInitialisation.configuration.ActorConfiguration;
import com.xworkz.springInitialisation.things.Actor;

public class ActorRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext spring=new AnnotationConfigApplicationContext(ActorConfiguration.class);
		String[] beans=spring.getBeanDefinitionNames();
		System.out.println(Arrays.toString(beans));
		
		Actor actor=spring.getBean("actor",Actor.class);
		System.out.println(actor.getName());
		System.out.println(actor.getLanguage());
		System.out.println(actor.getAge());
		
		Actor actor2=spring.getBean("film",Actor.class);
		System.out.println(actor2.getName());
		System.out.println(actor2.getLanguage());
		System.out.println(actor2.getAge());

	}

}
