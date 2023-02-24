package com.xworkz.bigBasket.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.bigBasket.dto.BigBasketDto;
import com.xworkz.bigBasket.service.BigBasketService;

@Controller
@RequestMapping("/bigBasket")
public class BigBasketController {
	
	
	@Autowired
	private BigBasketService Service;
	
	 private List<String> lists=Arrays.asList("Biscket","chokolate","fruits","Vegitables","nov-veg","Soap");
	 private List<String> areas=Arrays.asList("Rajajinagar","Btm","Shivaginagar","mejestic","malleshwaram","gandhi nagara");
	
	
	public BigBasketController() {
		System.out.println("Create:"+this.getClass().getSimpleName());
	}
	
	@GetMapping
	public String onCall(Model model) {
		System.out.println("Running onCall in get mapping");
		 List<String> lists=Arrays.asList("Biscket","chokolate","fruits","Vegitables","nov-veg","Soap");
		 List<String> areas=Arrays.asList("Rajajinagar","Btm","Shivaginagar","mejestic","malleshwaram","gandhi nagara");
		model.addAttribute("lists",lists);
		model.addAttribute("areas",areas);
		
		return "bigBasket";
		
	}
	@PostMapping
	public String onCall(Model model,BigBasketDto dto) {
		System.out.println("Running onCall in post mapping");
		
		Set<ConstraintViolation<BigBasketDto>> violations= Service.validateAndSave(dto);
		if(violations.isEmpty()) {
			System.out.println("There is violation in the dto goto sucess page");
			model.addAttribute("name",dto.getName());
			model.addAttribute("ownerName",dto.getOwnerName());
			model.addAttribute("email",dto.getEmail());
			model.addAttribute("passWord",dto.getPassWord());
			model.addAttribute("list",dto.getList());
			model.addAttribute("area",dto.getArea());
			model.addAttribute("shopNumber",dto.getShopNumber());
			model.addAttribute("mobileNumber",dto.getMobileNumber());
			model.addAttribute("wifeName",dto.getWifeName());
			model.addAttribute("anualIncome",dto.getAnualIncome());
			return "sucess";
		}
		else {
			model.addAttribute("lists",lists);
			model.addAttribute("areas",areas);
			model.addAttribute("error",violations);
			System.err.println("violation in controller");
			return "bigBasket";	
		}	
	}

}
