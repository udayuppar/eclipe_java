package com.xworkz.goa.controler;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.goa.dto.CasinoDto;

@Component
@RequestMapping("/casino")
public class CasinoControler {
	public CasinoControler() {
		System.out.println("Create:"+this.getClass().getSimpleName());
	}
	
	@PostMapping
	public String onCasino(CasinoDto casinoDto, Model model) {
		System.out.println("Running on casino:"+casinoDto);
		model.addAttribute("name",casinoDto.getName());
		model.addAttribute("cruice",casinoDto.getCruice());
		model.addAttribute("entryFee",casinoDto.getEntryFee());
		model.addAttribute("freeFod",casinoDto.isFreeFod());
		return "CasinoSucess.jsp";
	}
}
