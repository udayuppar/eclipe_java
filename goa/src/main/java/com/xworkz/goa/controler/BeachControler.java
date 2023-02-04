package com.xworkz.goa.controler;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.goa.dto.BeachDto;

@Component
@RequestMapping("/goa")
public class BeachControler {
	
	public BeachControler() {
		System.out.println("Create:" +this.getClass().getSimpleName());
	}
	
	@PostMapping
	public String onGoa(BeachDto beachDto, Model model) {
		System.out.println("Running on goa:"+beachDto);
		model.addAttribute("name",beachDto.getName());
		model.addAttribute("location",beachDto.getLocation());
		model.addAttribute("clean",beachDto.isClean());
		model.addAttribute("games",beachDto.isGames());
		return "BeachSucess.jsp";
	}

}
