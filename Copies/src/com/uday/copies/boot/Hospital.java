package com.uday.copies.boot;

public class Hospital {
	public String name;
	public String ownerName;
	public String deanName;
	public String experienceDoctorName;
	public int noOfDocter;
	public String[] doctersName;
	public String[] sistersName;
	public String[] departments;
	public long[] helpLineNumber;
	public String[] ambulenceName;

	public Hospital(String name, String ownerName, String deanName, String experienceDoctorName, int noOfDocter,
			String[] doctersName, String[] sistersName, String[] departments, long[] helpLineNumber,
			String[] ambulenceName) {
		this.name = name;
		this.ownerName = ownerName;
		this.deanName = deanName;
		this.experienceDoctorName = experienceDoctorName;
		this.noOfDocter = noOfDocter;
		this.doctersName = doctersName;
		this.sistersName = sistersName;
		this.departments = departments;
		this.helpLineNumber = helpLineNumber;
		this.ambulenceName = ambulenceName;
	}

	public void display() {
		System.out.println(this.name);
		System.out.println(this.ownerName);
		System.out.println(this.deanName);
		System.out.println(this.experienceDoctorName);
		System.out.println(this.noOfDocter);
		System.out.println("================================");
		System.out.println("Docters name");
		System.out.println("================================");
		for (int i = 0; i < doctersName.length; i++) {
			String string = doctersName[i];
			System.out.println(string);

		}
		System.out.println("================================");
		System.out.println("Sisters name");
		System.out.println("================================");
		for (int i = 0; i < sistersName.length; i++) {
			String string = sistersName[i];
			System.out.println(string);

		}
		System.out.println("================================");
		System.out.println("Departments name");
		System.out.println("================================");
		for (int i = 0; i < departments.length; i++) {
			String string = departments[i];
			System.out.println(string);

		}
		System.out.println("================================");
		System.out.println("Helpline number");
		System.out.println("================================");
		for (int i = 0; i < helpLineNumber.length; i++) {
			long string = helpLineNumber[i];
			System.out.println(string);

		}
		System.out.println("================================");
		System.out.println("Ambulence name");
		System.out.println("================================");
		for (int i = 0; i < ambulenceName.length; i++) {
			String string = ambulenceName[i];
			System.out.println(string);

		}
	}
}
