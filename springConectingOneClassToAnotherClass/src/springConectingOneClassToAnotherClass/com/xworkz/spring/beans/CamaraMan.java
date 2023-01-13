package springConectingOneClassToAnotherClass.com.xworkz.spring.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CamaraMan {
	
	@Autowired
	private Camara camara;
	
	public CamaraMan() {
		System.out.println("Registering CamaraMan in Spring");
	}

}
