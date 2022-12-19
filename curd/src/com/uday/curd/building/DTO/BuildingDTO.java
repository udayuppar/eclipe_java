package com.uday.curd.building.DTO;

public class BuildingDTO extends AbstractAdiutDto {

	private int no;
	private String name;
	private String ownerName;
	private int noOfFloors;
	private Type type;

	public BuildingDTO() {
		System.out.println("Running BuildingDTO default const..........");
	}

	public BuildingDTO(int no, String name, String ownerName, int noOfFloors, Type type) {
		super();
		this.no = no;
		this.name = name;
		this.ownerName = ownerName;
		this.noOfFloors = noOfFloors;
		this.type = type;
	}

	@Override
	public String toString() {
		return "BuildingDTO [no=" + no + ", name=" + name + ", ownerName=" + ownerName + ", noOfFloors=" + noOfFloors
				+ ", type=" + type + ", toString()=" + super.toString() + "]";
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public int getNoOfFloors() {
		return noOfFloors;
	}

	public void setNoOfFloors(int noOfFloors) {
		this.noOfFloors = noOfFloors;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

}
