package com.xworkz.egg.controller;

import java.util.Set;

import javax.validation.ConstraintViolation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.egg.dto.CMDto;
import com.xworkz.egg.service.CMService;

@Controller
@RequestMapping("/cm")
public class CMController {
	
	@Autowired
	private CMService cmService;
	
	public CMController() {
		System.out.println("Create:"+this.getClass().getSimpleName());
	}
	@PostMapping
	public String onCall(Model model,CMDto dto) {
		System.out.println("Running oncall in controller"+dto);
		Set<ConstraintViolation< CMDto>> constraintViolations=this.cmService.validateAndSave(dto);
		if(!constraintViolations.isEmpty()) {
			System.err.println("Validation failed display error message");
			constraintViolations.forEach((cv)->System.err.println(cv.getMessage()));
		}else {
			System.out.println("Validation sucess,display sucess message");
		}
		return "CM";
	}

}
