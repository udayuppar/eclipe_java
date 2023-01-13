package springConectingOneClassToAnotherClass.com.xworkz.spring.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import springConectingOneClassToAnotherClass.com.xworkz.spring.beans.Movie;

@Configuration
@ComponentScan("springConectingOneClassToAnotherClass.com.xworkz.spring")
public class MovieConfiguration {
	
	@Bean
	public Movie kannadaMovie() {
		System.out.println("Registering kannadaMovie in spring");
		Movie movie=new Movie();
		return movie;
	}
	

}
