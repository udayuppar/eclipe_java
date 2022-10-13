package com.uday.copies.boot;

public class Passport {

	public String name;
	public long no;
	public int expiryDate;
	public String country;
	public int issueDate;

	public Passport() {
		System.out.println("print the default values");
	}

	public Passport(String name) {
		this.name = name;
		System.out.println("variable value print on instance memory");
	}

	public Passport(long no) {
		this.no = no;
		System.out.println("variable value print on instance memory");
	}

	public Passport(int expiryDate) {
		this.expiryDate = expiryDate;
		System.out.println("variable value print on instance memory");
	}

	public Passport(String name, long no) {
		this.name = name;
		this.no = no;
		System.out.println("variable value print on instance memory");
	}

	public Passport(String name, int expiryDate) {
		this.name = name;
		this.expiryDate = expiryDate;
		System.out.println("variable value print on instance memory");
	}

	public Passport(String name, String country) {
		this.name = name;
		this.country = country;
		System.out.println("variable value print on instance memory");
	}

	public Passport(int expiryDate, long no) {
		this.expiryDate = expiryDate;
		this.no = no;
		System.out.println("variable value print on instance memory");
	}

}
