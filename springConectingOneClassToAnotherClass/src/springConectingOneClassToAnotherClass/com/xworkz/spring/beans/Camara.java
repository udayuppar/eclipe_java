package springConectingOneClassToAnotherClass.com.xworkz.spring.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Camara {

	@Autowired
	private Lens lens;
	@Autowired
	private Battery battery;
	
	public Camara() {
		System.out.println("Registering Camara in Spring");
	}
}
