package com.xworkz.map.dto;

public class PlaceDto {

	private String name;
	private String location;
	private String builtBy;
	private boolean destroyedBy;
	private double visitingFees;

	public PlaceDto() {
		// TODO Auto-generated constructor stub
	}

	public PlaceDto(String name, String location, String builtBy, boolean destroyedBy, double visitingFees) {
		super();
		this.name = name;
		this.location = location;
		this.builtBy = builtBy;
		this.destroyedBy = destroyedBy;
		this.visitingFees = visitingFees;
	}

	@Override
	public String toString() {
		return "PlaceDto [name=" + name + ", location=" + location + ", builtBy=" + builtBy + ", destroyedBy="
				+ destroyedBy + ", visitingFees=" + visitingFees + "]";

	}

	@Override
	public int hashCode() {
		System.out.println("Running Hashcode............");
		return 10;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Running equals method..........:" + obj);
		if (obj != null) {
			if (obj instanceof PlaceDto) {
				PlaceDto dto = (PlaceDto) obj;
				if (dto.name.equals(this.name) && dto.location.equals(this.location)) {
					System.out.println("Name and location is macthed: " + name + location);
					return true;
				}
			}
		}
		return false;
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

	public String getBuiltBy() {
		return builtBy;
	}

	public void setBuiltBy(String builtBy) {
		this.builtBy = builtBy;
	}

	public boolean isDestroyedBy() {
		return destroyedBy;
	}

	public void setDestroyedBy(boolean destroyedBy) {
		this.destroyedBy = destroyedBy;
	}

	public double getVisitingFees() {
		return visitingFees;
	}

	public void setVisitingFees(double visitingFees) {
		this.visitingFees = visitingFees;
	}

}
