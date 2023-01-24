package com.uday.association.things.person;

public class Email {

	public long id;
	public int password;
	public long mobileNo;
	public Company company = new Company(null, null);

	public Email(long id, int password, long mobileNo) {
		super();
		this.id = id;
		this.password = password;
		this.mobileNo = mobileNo;
	}

	public void display() {
		System.out.println(id);
		System.out.println(password);
		System.out.println(mobileNo);
		System.out.println("*****************************");
		if (company != null) {
			company.display();
		}
	}

}
