package com.uday.inheritence.things.equality.things;

public class Paint {
	private String name;
	private String brand;
	private String colour;
	private double price;
	private String shopName;
	private String manufDate;
	private int weight;
	private boolean quality;
	private int quantity;
	private String ownerName;

	public Paint() {
		// TODO Auto-generated constructor stub
	}

	public Paint(String name, String brand, String colour, double price, String shopName, String manufDate, int weight,
			boolean quality, int quantity, String ownerName) {
		super();
		this.name = name;
		this.brand = brand;
		this.colour = colour;
		this.price = price;
		this.shopName = shopName;
		this.manufDate = manufDate;
		this.weight = weight;
		this.quality = quality;
		this.quantity = quantity;
		this.ownerName = ownerName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getManufDate() {
		return manufDate;
	}

	public void setManufDate(String manufDate) {
		this.manufDate = manufDate;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public boolean isQuality() {
		return quality;
	}

	public void setQuality(boolean quality) {
		this.quality = quality;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String toString() {
		return "Paint [name=" + name + ", brand=" + brand + ", colour=" + colour + ", price=" + price + ", shopName="
				+ shopName + ", manufDate=" + manufDate + ", weight=" + weight + ", quality=" + quality + ", quantity="
				+ quantity + ", ownerName=" + ownerName + "]";
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("running equals method in paint");
		if (obj instanceof Paint) {
			System.out.println("other is paint can check the properties");
			Paint casted = (Paint) obj;
			if (this.brand.equals(casted.brand)) {
				System.out.println("brand is same");
				return true;
			}
		} else {
			System.err.println("other is not paint, cannot check the properties");
		}
		return false;

	}

}
