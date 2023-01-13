package springConectingOneClassToAnotherClass.com.xworkz.spring.beans;

import org.springframework.stereotype.Component;

@Component
public class Area {
	
	public Area() {
		System.out.println("Registering Area in Spring");
	}
}
