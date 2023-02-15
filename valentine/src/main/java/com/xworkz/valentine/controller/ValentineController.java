package com.xworkz.valentine.controller;

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

import com.xworkz.valentine.dto.ValentineDto;
import com.xworkz.valentine.service.ValentineService;

@Controller
@RequestMapping("/valentine")
public class ValentineController {

	@Autowired
	private ValentineService service;

	 private List<String> places = Arrays.asList("Lal bagh", "Kabban Park", "Mall", "Temple", "Market");

	 private List<String> gifts = Arrays.asList("Teddy", "Mobile", "Wacth", "Rose", "Chocolate");

	public ValentineController() {
		System.out.println("Create:" + this.getClass().getSimpleName());
	}

	@GetMapping
	public String onCall(Model model) {
		System.out.println("Running onCall on getMapping ");
		System.out.println("************************");
		model.addAttribute("places" ,places);
		model.addAttribute("gifts",gifts);
		System.out.println("****************");
		
		return "valentine";
	}

	@PostMapping
	public String onCall(Model model, ValentineDto dto) {
		System.out.println("Running onCall on postMapping");

		Set<ConstraintViolation<ValentineDto>> violations = service.validateAndSave(dto);
		if (violations.isEmpty()) {
			System.out.println("no Violation in this controller save in success page");
			return "sucess";
		} else {

			model.addAttribute("places", places);
			model.addAttribute("gifts", gifts);
			model.addAttribute("error", violations);
			model.addAttribute("dto",dto);
			System.err.println("violation in controller");
			return "valentine";

		}
	}

}
