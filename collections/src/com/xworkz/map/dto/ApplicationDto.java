package com.xworkz.map.dto;

public class ApplicationDto {
	private String name;
	private double version;
	private boolean free;
	private String devolopedBy;
	private double price;
	
	public ApplicationDto() {
		// TODO Auto-generated constructor stub
	}

	public ApplicationDto(String name, double version, boolean free, String devolopedBy, double price) {
		super();
		this.name = name;
		this.version = version;
		this.free = free;
		this.devolopedBy = devolopedBy;
		this.price = price;
	}

	@Override
	public String toString() {
		return "ApplicationDto [name=" + name + ", version=" + version + ", free=" + free + ", devolopedBy="
				+ devolopedBy + ", price=" + price + "]";
	}
	
	@Override
	public int hashCode() {
		System.out.println("Running hashcode..........");
		return 10;
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("Running eqauals method....... :"+obj);
		if(obj!=null) {
			if(obj instanceof ApplicationDto) {
				ApplicationDto dto=(ApplicationDto) obj;
				if(dto.name.equals(this.name)&& dto.price==(this.price)) {
					System.out.println("NAme and price is matched.....:"+name +price);
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

	public double getVersion() {
		return version;
	}

	public void setVersion(double version) {
		this.version = version;
	}

	public boolean isFree() {
		return free;
	}

	public void setFree(boolean free) {
		this.free = free;
	}

	public String getDevolopedBy() {
		return devolopedBy;
	}

	public void setDevolopedBy(String devolopedBy) {
		this.devolopedBy = devolopedBy;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
	

}
