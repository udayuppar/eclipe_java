package com.uday.inheritence.things.equality.things;

public class Currancy {
	private String type;
	private double makingCost;
	private char code;
	private int totalCurrancy;
	private boolean strong;
	private String countryName;
	private double convertingPrice;
	private String material;
	private int validity;
	private String acceptableCountries;

	public Currancy() {
		System.out.println("default constructor of the currency");
	}

	public Currancy(String type, double makingCost, char code, int totalCurrancy, boolean strong, String countryName,
			double convertingPrice, String material, int validity, String acceptableCountries) {
		super();
		this.type = type;
		this.makingCost = makingCost;
		this.code = code;
		this.totalCurrancy = totalCurrancy;
		this.strong = strong;
		this.countryName = countryName;
		this.convertingPrice = convertingPrice;
		this.material = material;
		this.validity = validity;
		this.acceptableCountries = acceptableCountries;
	}

	@Override
	public boolean equals(Object obj) {
		 if(obj instanceof Currancy) { //checking about instance of
	    	 System.out.println("obj is the instance of currancy ");
	    	 Currancy currancy3=(Currancy)obj; //casting 
	    	 if(this.material.equals(currancy3.material) && this.type.equals(currancy3.type)&& this.countryName.equals(currancy3.countryName)&& this.acceptableCountries.equals(currancy3.acceptableCountries)) {
	    		 System.out.println("material,countryName,acceptableCountries and type are same");
	    		 return true;
	    	 }else {
	    		 System.err.println("material ,countryName,acceptableCountries and type are not same ");
	    		 return false;
	    	 }
	     }
	     else {
	    	 System.err.println("obj is not a instance of currancy");
	     }
		return super.equals(obj);
	}

	@Override
	public String toString() {
		return "Currancy [type=" + type + ", makingCost=" + makingCost + ", code=" + code + ", totalCurrancy="
				+ totalCurrancy + ", strong=" + strong + ", countryName=" + countryName + ", convertingPrice="
				+ convertingPrice + ", material=" + material + ", validity=" + validity + ", acceptableCountries="
				+ acceptableCountries + "]";
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getMakingCost() {
		return makingCost;
	}

	public void setMakingCost(double makingCost) {
		this.makingCost = makingCost;
	}

	public char getCode() {
		return code;
	}

	public void setCode(char code) {
		this.code = code;
	}

	public int getTotalCurrancy() {
		return totalCurrancy;
	}

	public void setTotalCurrancy(int totalCurrancy) {
		this.totalCurrancy = totalCurrancy;
	}

	public boolean isStrong() {
		return strong;
	}

	public void setStrong(boolean strong) {
		this.strong = strong;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public double getConvertingPrice() {
		return convertingPrice;
	}

	public void setConvertingPrice(double convertingPrice) {
		this.convertingPrice = convertingPrice;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public int getValidity() {
		return validity;
	}

	public void setValidity(int validity) {
		this.validity = validity;
	}

	public String getAcceptableCountries() {
		return acceptableCountries;
	}

	public void setAcceptableCountries(String acceptableCountries) {
		this.acceptableCountries = acceptableCountries;
	}

}


