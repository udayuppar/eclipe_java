package springConectingOneClassToAnotherClass.com.xworkz.spring.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Location {
	
	@Autowired
	private Area area;
	
	public Location() {
		System.out.println("Regestering Location in Spring");
	}
	

}
