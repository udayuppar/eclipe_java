package com.uday.curd.helmet.DTO;

public class HelmetDTO extends AbstractAuditDTO {
	
	private String name;
	private Double price;
	private HelmetType type;
	private String colour;
	
	public HelmetDTO() {
		System.out.println("Running Helmet default const");
	}

	public HelmetDTO(String name, Double price, HelmetType type, String colour) {
		super();
		this.name = name;
		this.price = price;
		this.type = type;
		this.colour = colour;
	}

	@Override
	public String toString() {
		return "HelmetDTO [name=" + name + ", price=" + price + ", type=" + type + ", colour=" + colour
				+ ", toString()=" + super.toString() + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public HelmetType getType() {
		return type;
	}

	public void setType(HelmetType type) {
		this.type = type;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}
	

}
