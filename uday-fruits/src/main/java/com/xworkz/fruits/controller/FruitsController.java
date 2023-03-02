package com.xworkz.fruits.controller;

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

import com.xworkz.fruits.dto.FruitsDto;
import com.xworkz.fruits.service.FruitsService;

@Controller
@RequestMapping("/")
public class FruitsController {

	@Autowired
	private FruitsService service;

	private List<String> select = Arrays.asList("Mango", "Orenge", "Banana", "Pinapal", "Pomogrenate", "Stabery");

	public FruitsController() {
		System.out.println("Create:" + this.getClass().getSimpleName());
	}

	@GetMapping("/fruitss")
	public String onCall(Model model) {
		System.out.println("Running on call on get mapping");
		List<String> select = Arrays.asList("Mango", "Orenge", "Banana", "Pinapal", "Pomogrenate", "Stabery");

		model.addAttribute("select", select);
		return "fruits";
	}

	@PostMapping("/fruitss")
	public String onCall(FruitsDto dto, Model model) {
		System.out.println("Running on call on post mapping");

		Set<ConstraintViolation<FruitsDto>> violations = this.service.validateAndSave(dto);

		if (violations.isEmpty()) {
			System.out.println("There is no violation in dto save in sucess page");
			model.addAttribute("name", dto.getName());
			model.addAttribute("select", dto.getSelectFruits());
			model.addAttribute("quantity", dto.getQuantity());
			model.addAttribute("location", dto.getLocation());
			model.addAttribute("mobileNumber", dto.getMobileNumber());
			return "fruits";
		} else {
			model.addAttribute("select", select);
			model.addAttribute("dto", dto);

			model.addAttribute("error", violations);
			System.err.println("Violation in data....");
			return "fruits";
		}

	}

	@GetMapping("/search")
	public String onSearch(@RequestParam int id, Model model) {

		System.out.println("Running on call in controller");
		FruitsDto dto = this.service.findById(id);
		if (dto != null) {
			model.addAttribute("dto", dto);
		} else {
			model.addAttribute("message", "Id  not found, please give valid Id");
		}
		return "search";
	}

	@GetMapping("/findByName")
	public String onFindByName(@RequestParam String name, Model model) {
		System.out.println("Running find By name in Controller:" + name);
		List<FruitsDto> dto = this.service.findByName(name);
		if (dto != null) {
			model.addAttribute("dto", dto);
		} else {
			model.addAttribute("messege", "Name not found");
		}
		return "findByName";
	}

	@GetMapping("/findByLocation")
	public String onFindByNameAndMobileNumberAndLocation(@RequestParam String location, Model model) {
		System.out.println("Running findByNameAndMobileNumberAndLocationin Controller:" + location);
		List<FruitsDto> dto = this.service.findByLocation(location);
		if (dto != null) {
			model.addAttribute("dto", dto);
		} else {
			model.addAttribute("message", "Name not found");
		}
		return "findByLocation";
	}

	@GetMapping("/update")
	public String onUpdate(@RequestParam int id, Model model) {
		System.out.println("Running on update on get mapping:" + id);
		FruitsDto dto = this.service.findById(id);
		model.addAttribute("dto", dto);
		model.addAttribute("select", select);
		return "update";
	}
	
	@GetMapping("/delete")
	public String onDelete(@RequestParam int id, Model model) {
		System.out.println("Running find By name in Controller:" + id);
		FruitsDto dto = this.service.deleteById(id);
		if (dto==null) {
			
			model.addAttribute("id", id);
			//model.addAttribute("error", "Name not found");
			model.addAttribute("message", "Delete Succesfully");
		} else {
			model.addAttribute("error", "Name not found");
		}
		return "delete";
	}
}
