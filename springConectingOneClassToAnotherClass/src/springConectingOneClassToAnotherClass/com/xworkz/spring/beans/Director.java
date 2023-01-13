package springConectingOneClassToAnotherClass.com.xworkz.spring.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Director {
	
	@Autowired
	private Produser producer;
	
	public Director() {
		System.out.println("Registering Director in Spring");
	}

}
