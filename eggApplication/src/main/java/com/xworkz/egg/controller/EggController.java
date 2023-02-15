package com.xworkz.egg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.egg.dto.EggDto;
import com.xworkz.egg.survice.EggService;


@Controller
@RequestMapping("/egg")
public class EggController {
	
	@Autowired
	private EggService service;
	
	public EggController() {
		System.out.println("Create:"+this.getClass().getSimpleName());
	}
	
	@PostMapping
	public String onOrder(Model model, EggDto dto) {
		System.out.println("Running onOrder in Controller"+dto);
		boolean saved=this.service.validateAndSave(dto);
		System.out.println("Saved:"+saved);
		return "index";
		
		
	}

}
