package com.uday.association.things.country;

public class President {
	public String name;
	public int tenture = 6;
	public Gender gender = new Gender("Male", "Female", "trans");

	public President(String name, int tenture) {
		super();
		this.name = name;
		this.tenture = tenture;
	}

	public void test() {
		System.out.println("president name:" + name);
		System.out.println("president tenture:" + tenture);
		System.out.println("************************************");
		if (gender != null) {
			this.gender.male = gender.male;
			this.gender.transgender = gender.transgender;
			this.gender.female = gender.female;

		}
		gender.showOff();
	}

}
