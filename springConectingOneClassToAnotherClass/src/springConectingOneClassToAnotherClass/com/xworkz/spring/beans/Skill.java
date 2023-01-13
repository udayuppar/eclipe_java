package springConectingOneClassToAnotherClass.com.xworkz.spring.beans;

import org.springframework.stereotype.Component;

@Component
public class Skill {
	
	public Skill() {
		System.out.println("Registering Skill in Spring");
	}

}
