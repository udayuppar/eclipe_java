package springConectingOneClassToAnotherClass.com.xworkz.spring.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Produser {
	
	@Autowired
	private Assistant assistant;
	
	public Produser() {
		System.out.println("Registering Producer in Spring");
	}

}
