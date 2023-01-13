package springConectingOneClassToAnotherClass.com.xworkz.spring.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Movie {
	
	@Autowired
	private Director director;
	@Autowired
	private Experience experience;
	@Autowired
	private CamaraMan camaraMan;
	
	public Movie() {
		System.out.println("Registering Movie in Spring");
	}

}
