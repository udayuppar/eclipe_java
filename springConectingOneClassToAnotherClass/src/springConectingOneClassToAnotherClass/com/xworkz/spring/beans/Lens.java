package springConectingOneClassToAnotherClass.com.xworkz.spring.beans;

import org.springframework.stereotype.Component;

@Component
public class Lens {
	
	public Lens() {
		System.out.println("Registering lens in Spring");
	}

}
