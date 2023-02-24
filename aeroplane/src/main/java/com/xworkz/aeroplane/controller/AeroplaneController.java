package com.xworkz.aeroplane.controller;

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
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.aeroplane.dto.AeroplaneDto;
import com.xworkz.aeroplane.service.AeroplaneService;

@Controller
@RequestMapping("/")
public class AeroplaneController {
	
	@Autowired
	private AeroplaneService service;
	
	private List<String> types = Arrays.asList("Passenger", "Cargo", "Fighter Plane", "Private jet", "Jumbo");
	private List<String> countrys = Arrays.asList("India", "Pakistan", "United State", "Astrelia", "Englend",
			"South Africa");

	public AeroplaneController() {
		System.out.println("Create:" + this.getClass().getSimpleName());
	}

	@GetMapping("aeroplane")
	public String onCall(Model model) {
		System.out.println("Running onCall in getMapping");
		

		model.addAttribute("types", types);
		model.addAttribute("countrys", countrys);

		return "aeroplane";

	}
	@PostMapping("aeroplane")
	public String onCall(Model model, AeroplaneDto aeroplaneDto) {
		System.out.println("Running onCall in post mapping");
		
		Set<ConstraintViolation<AeroplaneDto>> violations=this.service.validateAndSave(aeroplaneDto);
		
		if(violations.isEmpty()) {
			System.out.println("There is no violation in controller save in success page:"+aeroplaneDto);
			
			model.addAttribute("company",aeroplaneDto.getCompany());
			model.addAttribute("name",aeroplaneDto.getName());
			model.addAttribute("cost",aeroplaneDto.getCost());
			model.addAttribute("types",aeroplaneDto.getType());
			model.addAttribute("countrys",aeroplaneDto.getCountry());
			
			return "aeroplane";
		}else {
			model.addAttribute("types", types);
			model.addAttribute("countrys", countrys);
			model.addAttribute("error", violations);
			System.err.println("Violation in data....");
			return "aeroplane";
			
		}
		
		
	}
		@GetMapping("/search")
		public String onSearch(@RequestParam int id,Model model) {
			
			System.out.println("Running on call in controller");
		  AeroplaneDto dto=this.service.findById(id);
		  if(dto!=null) {
			  model.addAttribute("dto", dto);
		  }
		  else {
			  model.addAttribute("message","Id  not found, please give valid Id");
		  }
			return "search";
		}

}
