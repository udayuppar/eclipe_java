package com.uday.copies.things;

import com.uday.copies.boot.Passport;

public class PassportRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Passport passport = new Passport();
		System.out.println(passport.country);
		System.out.println(passport.name);
		System.out.println(passport.no);
		System.out.println(passport.expiryDate);
		System.out.println(passport.issueDate);
		System.out.println("------------------------");

		Passport passport2 = new Passport("Kingfisher");
		System.out.println(passport2.country);
		System.out.println(passport2.name);
		System.out.println(passport2.no);
		System.out.println(passport2.expiryDate);
		System.out.println(passport2.issueDate);
		System.out.println("------------------------");

		Passport passport3 = new Passport(564512654l);
		System.out.println(passport3.country);
		System.out.println(passport3.name);
		System.out.println(passport3.no);
		System.out.println(passport3.expiryDate);
		System.out.println(passport3.issueDate);
		System.out.println("------------------------");

		Passport passport4 = new Passport(20);
		System.out.println(passport4.country);
		System.out.println(passport4.name);
		System.out.println(passport4.no);
		System.out.println(passport4.expiryDate);
		System.out.println(passport4.issueDate);
		System.out.println("------------------------");

		Passport passport5 = new Passport("Kingfisher", 5463215l);
		System.out.println(passport5.country);
		System.out.println(passport5.name);
		System.out.println(passport5.no);
		System.out.println(passport5.expiryDate);
		System.out.println(passport5.issueDate);
		System.out.println("------------------------");

		Passport passport6 = new Passport("Kingfisher", 25);
		System.out.println(passport6.country);
		System.out.println(passport6.name);
		System.out.println(passport6.no);
		System.out.println(passport6.expiryDate);
		System.out.println(passport6.issueDate);
		System.out.println("------------------------");

		Passport passport7 = new Passport("kingfisher", "united state");
		System.out.println(passport7.country);
		System.out.println(passport7.name);
		System.out.println(passport7.no);
		System.out.println(passport7.expiryDate);
		System.out.println(passport7.issueDate);
		System.out.println("------------------------");

		Passport passport8 = new Passport(25, 56412365l);
		System.out.println(passport8.country);
		System.out.println(passport8.name);
		System.out.println(passport8.no);
		System.out.println(passport8.expiryDate);
		System.out.println(passport8.issueDate);
		System.out.println("------------------------");

	}

}
