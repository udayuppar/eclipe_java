package springConectingOneClassToAnotherClass.com.xworkz.spring.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Company {
	
	@Autowired
	private Location location;
	
	public Company() {
		System.out.println("Registering Company in Spring");
	}

}
