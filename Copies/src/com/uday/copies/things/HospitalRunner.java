package com.uday.copies.things;

import com.uday.copies.boot.Hospital;

public class HospitalRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] items = { "Akash", "Ajay", "Sanju", "Kiran" };
		String[] temp = { "Asha", "Usha", "Kavitha", "Archana" };
		String[] dept = { "Gynacologist", "Heart Specialist", "Dental", "Cardiology" };
		long[] help = { 8861539422l, 9741627422l, 7259232100l, 8697456987l };
		String[] ambu = { "Ganga", "Thunga", "Kaveri", "Sharavathi" };

		Hospital hospital = new Hospital("Meghan", "uday", "Vittal", "Subbu", 50, items, temp, dept, help, ambu);
		System.out.println(hospital.name);
		System.out.println(hospital.ownerName);
		System.out.println(hospital.deanName);
		System.out.println(hospital.experienceDoctorName);
		System.out.println(hospital.noOfDocter);
		System.out.println(hospital.doctersName);
		System.out.println(hospital.sistersName);
		System.out.println(hospital.departments);
		System.out.println(hospital.helpLineNumber);
		System.out.println(hospital.ambulenceName);

		hospital.display();

	}

}
