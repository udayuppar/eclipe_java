package com.uday.curd.theater.DTO;

public class TheaterDto extends AbstractAuditDto {
	
	private int id;
	private String brand;
	private String name;
	private Seats seats;
	
	public TheaterDto() {
		System.out.println("running TheaterDto default const");
	}

	public TheaterDto(int id, String brand, String name, Seats seats) {
		super();
		this.id = id;
		this.brand = brand;
		this.name = name;
		this.seats = seats;
	}

	@Override
	public String toString() {
		return "TheaterDto [id=" + id + ", brand=" + brand + ", name=" + name + ", seats=" + seats + ", toString()="
				+ super.toString() + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Seats getSeats() {
		return seats;
	}

	public void setSeats(Seats seats) {
		this.seats = seats;
	}
	
	

}
