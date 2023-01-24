package com.uday.association.things.person;

public class Job {
	public double salary;
	public String role;
	public int bond;
	public Company company=new Company("Infosys", "NarayanMurthy");
	
	public Job(double salary, String role, int bond) {
		super();
		this.salary = salary;
		this.role = role;
		this.bond = bond;
	}
	public void display()
	{
		System.out.println(salary);
		System.out.println(role);
		System.out.println(bond);
		System.out.println("******************************");
		if(company!=null)
		{
			company.display();
		}
	}
	
	
	

}
