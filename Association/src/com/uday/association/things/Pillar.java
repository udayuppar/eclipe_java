package com.uday.association.things;

public class Pillar {

	public int id;
	public String place;
	public float height;
	public String shape;
	public boolean supporting;
	public Company company = new Company("Metro", "Box");

	public Pillar(int id, String place, float height, String shape, boolean supporting) {
		this.id = id;
		this.place = place;
		this.height = height;
		this.supporting = supporting;
		this.shape = shape;
	}

	public void showOff() {
		System.out.println("Invoking is running,,,,,,,,,,,,,,");
		System.out.println("id number :" + id);
		System.out.println("place :" + place);
		System.out.println("height :" + height);
		System.out.println("supporting :" + supporting);
		System.out.println("shape :" + shape);
		System.out.println("*****************************************");

		if (company != null) {
			this.company.name = "gogle";
			this.company.type = "round";
		} else {
			System.out.println("invoking exist");
		}
		System.out.println("--------company detailse-------------");
		company.showOff();
	}
}
