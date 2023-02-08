package com.xworkz.bakery.controler;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.bakery.dto.BakaryDto;

@Component
@RequestMapping("/bakery")
public class BakeryControler {
	
	public BakeryControler() {
		System.out.println("Create:"+this.getClass().getSimpleName());
	}
	
	@PostMapping
	
	public String onBakeryDto(Model model, BakaryDto dto) {
		System.out.println("onBakeryDto:"+dto);
		model.addAttribute("name",dto.getName());
		model.addAttribute("ownerName",dto.getOwnerName());
		model.addAttribute("wifeName",dto.getWifeName());
		model.addAttribute("married",dto.isMarried());
		model.addAttribute("famousFor",dto.getFamousFor());
		model.addAttribute("since",dto.getSince());
		return "bakerySucess";
		
		
		
		
	}

}
