package com.uday.curd.bekery.DTO;



public class BekeryDto  extends  AbstactAduitDto{
	
	private String name;
	private String owner;
	private String location;
	private long contactNo;
	private FamousFor famous;
	
	public BekeryDto() {
	System.out.println("Running BekeryDto default const");
	}

	public BekeryDto(String name, String owner, String location, long contactNo, FamousFor famous) {
		super();
		this.name = name;
		this.owner = owner;
		this.location = location;
		this.contactNo = contactNo;
		this.famous = famous;
	}

	@Override
	public String toString() {
		return "BekeryDto [name=" + name + ", owner=" + owner + ", location=" + location + ", contactNo=" + contactNo
				+ ", famous=" + famous + ", toString()=" + super.toString() + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public long getContactNo() {
		return contactNo;
	}

	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}

	public FamousFor getFamous() {
		return famous;
	}

	public void setFamous(FamousFor famous) {
		this.famous = famous;
	}
	
	
	
}
