package com.uday.curd.pizza.survice;

import com.uday.curd.pizza.DTO.PizzaDTO;
import com.uday.curd.pizza.pizzaEnum.PizzaSize;

public class PizzaSurviceImpl implements PizzaSurvice {

	@Override
	public boolean validateAndSave(PizzaDTO dto) {

		String name = dto.getName();
		String company = dto.getCompany();
		PizzaSize size = dto.getPizza();
		double price = dto.getPrice();
		String flavour = dto.getFlavour();
		String type = dto.getType();
		boolean nameis = false;
		boolean companyis = false;
		boolean sizeis = false;
		boolean priceis = false;
		boolean flavouris = false;
		boolean typeis = false;

		if (name != null && name.length() >= 4 && name.length() <= 20) {
			System.out.println("pizza name is matched:" + name);
			nameis = true;
		} else {
			System.err.println("pizza name is not matched:" + name);
		}
		System.out.println(System.lineSeparator());

		if (company != null && company.length() >= 4 && company.length() <= 20) {
			System.out.println("company name is valid:" + company);
			companyis = true;
		} else {
			System.out.println("Company name is not valid: " + company);

		}
		System.out.println(System.lineSeparator());
		if (size != null) {
			System.out.println("size is valid:" + size);
			sizeis = true;

		} else {
			System.out.println("size is not valid:" + size);
		}
		System.out.println(System.lineSeparator());

		if (price >= 50 && price <= 2000) {
			System.out.println("price is valid :" + price);
			priceis = true;
		} else {
			System.err.println("Price is not valid:" + price);
		}
		System.out.println(System.lineSeparator());
		if (flavour != null && flavour.length() >= 3 && flavour.length() <= 20) {
			System.out.println("flavour is valid:" + flavour);
			flavouris = true;
		} else {
			System.out.println("flavour is not valid:" + flavour);
		}
		System.out.println(System.lineSeparator());
		if (type != null && type == "veg" || type == "Non veg") {
			System.out.println("type is valid:" + type);
			typeis = true;
		} else {
			System.out.println("type is not valid:" + type);
		}
		System.out.println(System.lineSeparator());

		if (nameis && companyis && sizeis && priceis && typeis && flavouris) {
			System.out.println("DTO is valid");
			return true;
		} else {
			System.out.println("Dto not found");
			return false;
		}

	}
}
