package com.uday.exception.word;

public  abstract class Person extends Object {
	private String name;
	private String location;
	private long mobileNum;
	private boolean goodPerson;
	private double salary;
	
	public void eat()
	
	{
		System.out.println("running eat method");
	}
	public void sleep()
	{
		System.out.println("running sleep method");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public long getMobileNum() {
		return mobileNum;
	}
	public void setMobileNum(long mobileNum) {
		this.mobileNum = mobileNum;
	}
	public boolean isGoodPerson() {
		return goodPerson;
	}
	public void setGoodPerson(boolean goodPerson) {
		this.goodPerson = goodPerson;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	

}
