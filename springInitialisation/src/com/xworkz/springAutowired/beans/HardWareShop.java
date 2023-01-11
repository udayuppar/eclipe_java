package com.xworkz.springAutowired.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class HardWareShop {
	@Autowired
	@Qualifier("ShopId")
	private int id;
	@Autowired
	@Qualifier("shopName")
	private String name;
	@Autowired
	@Qualifier("gstNumber")
	private  double gstNumber;
	@Autowired
	@Qualifier("ownerName")
	private String ownerName;
	@Autowired
	@Qualifier("location")
	private String location;
	
	public HardWareShop() {
		System.out.println("Rigistering HardWareShop in spring ");
	}

	@Override
	public String toString() {
		return "HardWareShop [id=" + id + ", name=" + name + ", gstNumber=" + gstNumber + ", ownerName=" + ownerName
				+ ", location=" + location + "]";
	}
	
	
	
	

}
