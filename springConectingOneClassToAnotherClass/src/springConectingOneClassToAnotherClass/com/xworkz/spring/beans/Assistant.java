package springConectingOneClassToAnotherClass.com.xworkz.spring.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Assistant {
	
	@Autowired
	private Company company;
	
	public Assistant() {
		System.out.println("Registering Assistant in Spring ");
	}

}
