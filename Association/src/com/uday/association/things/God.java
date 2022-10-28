package com.uday.association.things;

public class God {
	public String name;
	public String gender;
	public String mainPower;
	public Weapon weapon = new Weapon("gadhe", "kills", 2);

	public God(String name, String gender, String mainPower) {
		this.name = name;
		this.gender = gender;
		this.mainPower = mainPower;
	}

	public void display() {
		System.out.println("God name:" + name);
		System.out.println("gender:" + gender);
		System.out.println("mainPower:" + mainPower);
		System.out.println("****************************");
		if (weapon != null) {
			this.weapon.name = "gadhe";
			this.weapon.use = "kills";
			this.weapon.weight = 2;
		} else {
			System.out.println("invoking exits");
		}

		System.out.println("--------------display the weapon detailse------------------");
		weapon.kill();
	}

}
