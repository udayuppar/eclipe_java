package com.xworkz.map.dto;

public class DaughterDto {
	private String name;
	private long mobileNumber;
	private int age;
	private boolean commited;
	private boolean alive;
	
	public DaughterDto() {
		// TODO Auto-generated constructor stub
	}

	public DaughterDto(String name, long mobileNumber, int age, boolean commited, boolean alive) {
		super();
		this.name = name;
		this.mobileNumber = mobileNumber;
		this.age = age;
		this.commited = commited;
		this.alive = alive;
	}

	@Override
	public String toString() {
		return "DaughterDto [name=" + name + ", mobileNumber=" + mobileNumber + ", age=" + age + ", commited="
				+ commited + ", alive=" + alive + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isCommited() {
		return commited;
	}

	public void setCommited(boolean commited) {
		this.commited = commited;
	}

	public boolean isAlive() {
		return alive;
	}

	public void setAlive(boolean alive) {
		this.alive = alive;
	}
	
	

}
