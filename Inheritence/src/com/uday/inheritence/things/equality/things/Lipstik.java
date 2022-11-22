package com.uday.inheritence.things.equality.things;

public class Lipstik {
	private String brand;
	private String name;
	private double price;
	private String colors;
	private String gender;
	private String skinTone;
	private String user;
	private int no_Of_items;
	private String distric;
	private String State;
	private String country;
	
	 public Lipstik() {
		// TODO Auto-generated constructor stub
	}

	public Lipstik(String brand, String name, double price, String colors, String gender, String skinTone, String user,
			int no_Of_items, String distric, String state, String country) {
		super();
		this.brand = brand;
		this.name = name;
		this.price = price;
		this.colors = colors;
		this.gender = gender;
		this.skinTone = skinTone;
		this.user = user;
		this.no_Of_items = no_Of_items;
		this.distric = distric;
		State = state;
		this.country = country;
	}

	@Override
	public String toString() {
		return "Lipstik [brand=" + brand + ", name=" + name + ", price=" + price + ", colors=" + colors + ", gender="
				+ gender + ", skinTone=" + skinTone + ", user=" + user + ", no_Of_items=" + no_Of_items + ", distric="
				+ distric + ", State=" + State + ", country=" + country + "]";
	}

	 @Override
	public boolean equals(Object name) {
		 
		 System.out.println("eqals is printing");
		 
		 if(name instanceof Lipstik)
		 {
			 System.out.println("printing instance");
			 Lipstik lipstik=(Lipstik)name;
			 if(this.brand.equals(lipstik.brand)&&this.name.equals(lipstik.name)&& this.country.equals(lipstik.country)&&this.colors.equals(lipstik.colors)&&this.gender.equals(lipstik.gender)
					 &&this.State.equals(lipstik.State)&&this.user.equals(lipstik.user)&&this.distric.equals(lipstik.distric))
			 {
				 System.out.println("equals entry");
				 return true;
			 }
			 else {
				 System.out.println("does not eqal in lipstik");
			 }
		 }
		 
		return false;
	}
	
	public String getBrand() {
		return brand;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public String getColors() {
		return colors;
	}

	public String getGender() {
		return gender;
	}

	public String getSkinTone() {
		return skinTone;
	}

	public String getUser() {
		return user;
	}

	public int getNo_Of_items() {
		return no_Of_items;
	}

	public String getDistric() {
		return distric;
	}

	public String getState() {
		return State;
	}

	public String getCountry() {
		return country;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setColors(String colors) {
		this.colors = colors;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setSkinTone(String skinTone) {
		this.skinTone = skinTone;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public void setNo_Of_items(int no_Of_items) {
		this.no_Of_items = no_Of_items;
	}

	public void setDistric(String distric) {
		this.distric = distric;
	}

	public void setState(String state) {
		State = state;
	}

	public void setCountry(String country) {
		this.country = country;
	}


}
