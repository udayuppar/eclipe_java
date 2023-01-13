package springConectingOneClassToAnotherClass.com.xworkz.spring.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import springConectingOneClassToAnotherClass.com.xworkz.spring.beans.Movie;
import springConectingOneClassToAnotherClass.com.xworkz.spring.configuration.MovieConfiguration;

public class MovieRunner {
	
	public static void main(String[] args) {
		
		
		ApplicationContext container=new AnnotationConfigApplicationContext(MovieConfiguration.class);
		String[] beans=container.getBeanDefinitionNames();
		System.out.println(Arrays.toString(beans));
		
		Movie movie=container.getBean("movie", Movie.class);
		System.out.println(movie);
		
		Movie movie2=container.getBean("kannadaMovie", Movie.class);
		System.out.println(movie2);
	}

}
