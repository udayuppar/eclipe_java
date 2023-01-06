package com.xworkz.spring.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.spring.configuration.SpringConfiguration;
import com.xworkz.spring.things.Application;
import com.xworkz.spring.things.Area;
import com.xworkz.spring.things.Bus;
import com.xworkz.spring.things.Chocolate;
import com.xworkz.spring.things.City;
import com.xworkz.spring.things.Cycle;
import com.xworkz.spring.things.Fish;
import com.xworkz.spring.things.Girl;
import com.xworkz.spring.things.God;
import com.xworkz.spring.things.Mall;
import com.xworkz.spring.things.Mask;
import com.xworkz.spring.things.Milk;
import com.xworkz.spring.things.Park;
import com.xworkz.spring.things.Patient;
import com.xworkz.spring.things.Road;
import com.xworkz.spring.things.Temple;

public class RoadRunner {

	public static void main(String[] args) {

		ApplicationContext spring = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		Road ref = spring.getBean(Road.class);
		Bus ref1 = spring.getBean(Bus.class);
		Cycle cycle = spring.getBean(Cycle.class);
		Girl girl = spring.getBean(Girl.class);
		Milk milk = spring.getBean(Milk.class);
		Mask mask = spring.getBean(Mask.class);
		Patient patient = spring.getBean(Patient.class);
		Chocolate chocolate = spring.getBean(Chocolate.class);
		Area area = spring.getBean(Area.class);
		City city = spring.getBean(City.class);
		Fish fish = spring.getBean(Fish.class);
		Temple temple = spring.getBean(Temple.class);
		God god = spring.getBean(God.class);
		Park park = spring.getBean(Park.class);
		Mall mall = spring.getBean(Mall.class);
		Application application = spring.getBean(Application.class);
		System.out.println(ref);

		/*
		 * ApplicationContext is a interface of the Spring
		 * AnnotationConfigApplicationContext it is a implementation of interface of the
		 * spring in parameter we should pass the configuration class . class is nothing
		 * but a byte code and it is static class
		 */

	}

}
