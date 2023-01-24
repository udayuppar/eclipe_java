package com.uday.association.boot;

import com.uday.association.things.person.Email;
//import com.uday.association.things.person.Person;

public class PersonRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Email email=new Email(84564754l, 254, 8861539422l);
		email.display();
		
		Email email2=new Email(95461235l, 50, 9741627422l);
		email2.display();
		
		Email[] user= {email,email2};
		
		
		

	}

}
