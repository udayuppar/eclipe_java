package com.uday.association.things.country;

public class Gender {
	public String male;
	public String female;
	public String transgender;

	public Gender(String male, String female, String transgender) {
		super();
		this.male = male;
		this.female = female;
		this.transgender = transgender;
	}

	public void showOff() {
		System.out.println(male);
		System.out.println(female);
		System.out.println(transgender);
	}

}
