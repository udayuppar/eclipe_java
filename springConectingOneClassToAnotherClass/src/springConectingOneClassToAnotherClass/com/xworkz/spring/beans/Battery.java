package springConectingOneClassToAnotherClass.com.xworkz.spring.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Battery {
	
	@Autowired
	private Capacity capacity;
	
	public Battery() {
		System.out.println("Registering Battary in Spring");
	}

}
