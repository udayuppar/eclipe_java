package com.uday.association.things.country;

public class Name {
	public String oldName;
	public String newName;
	public String futurName;

	public Name(String oldName, String newName, String futurName) {
		super();
		this.oldName = oldName;
		this.newName = newName;
		this.futurName = futurName;
	}

	public void display() {
		System.out.println("old name:" + oldName);
		System.out.println("new Name:" + newName);
		System.out.println("futur Name:" + futurName);
		System.out.println("************************************");
	}

}
