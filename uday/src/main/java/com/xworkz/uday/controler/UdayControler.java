package com.xworkz.uday.controler;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.uday.dto.BevarageDto;
import com.xworkz.uday.dto.ChatsDto;
import com.xworkz.uday.dto.EducationDto;
import com.xworkz.uday.dto.FamilyDto;
import com.xworkz.uday.dto.MobileDto;

@Component
@RequestMapping("/")
public class UdayControler {
	public UdayControler() {
		System.out.println("Create :"+this.getClass().getSimpleName());
	}
	
	@GetMapping("/email")
	public String onEmail(Model model) {
		System.out.println("Running onEmail");
		model.addAttribute("email","udayuday46973@gmail.com");
		
		return "index.jsp";
		
	}
	
	@GetMapping("/number")
	public String onMobileNumber(Model model) {
		System.out.println("Running onMobileNumber");
		model.addAttribute("MyNumber",8861539422L);
		return "index.jsp";	
	}

	@GetMapping("/adhar")
	public String onAdhar(Model model) {
		System.out.println("Running onAdhar");
		model.addAttribute("AdharNumber",232136426541L);
		return "index.jsp";	
	}
	
	@GetMapping("/age")
	public String onAge(Model model) {
		System.out.println("Running onAge");
		model.addAttribute("age",22);
		return "index.jsp";	
	}
	
	@GetMapping("/DOB")
	public String onDateOfBirth(Model model) {
		System.out.println("Running onDateOfBirth");
		model.addAttribute("DateOfBirth",LocalDateTime.of(2000, 12, 27, 06,10));
		return "index.jsp";	
	}
	
	@GetMapping("/salary")
	public String onDesiredSalary(Model model) {
		System.out.println("Running onDesiredSalary");
		model.addAttribute("DesierdSalary",4);
		return "index.jsp";	
	}
	
	@GetMapping("/best")
	public String onBestFreinds(Model model) {
		System.out.println("Running onBestFreinds");
		List<String> ref=new ArrayList<String>();
		ref.add("Ajay");
		ref.add("Akash");
		ref.add("Yash");
		ref.add("Sanju");
		model.addAttribute("BestFreind",ref);
		return "index.jsp";	
	}
	
	@GetMapping("/visits")
	public String onMostVisitedPlaces(Model model) {
		System.out.println("Running onMostVisitedPlaces");
		List<String> ref=new ArrayList<String>();
		ref.add("joga");
		ref.add("Murudeshwara");
		ref.add("Malpe");
		ref.add("Udupi");
		model.addAttribute("MostVisited",ref);
		return "index.jsp";	
	}
	
	@GetMapping("/skill")
	public String onSkillSet(Model model) {
		System.out.println("Running onSkillSet");
		List<String> ref=new ArrayList<String>();
		ref.add("JAVA");
		ref.add("SQL");
		ref.add("HTML");
		ref.add("CSS");
		model.addAttribute("skillSet",ref);
		return "index.jsp";	
	}
	@GetMapping("/collage")
	public String onEducationDto(Model model) {
		System.out.println("Running onEducationDto");
		EducationDto dto=new EducationDto();
	    dto.setDegreeName("BE");
		dto.setCollageName("JNNCE");
		dto.setLocation("Shivmogga");
		dto.setUsnNumber("4JN18ME074");
		dto.setBranch("Mechanical");
		dto.setFees(50000);
		dto.setGood(true);
		dto.setTotalCGPA(7.87f);
		dto.setAnyBackLog(false);
		dto.setAnyYearGap(false);
		
		model.addAttribute("data",dto);
		return "index.jsp";
		
	}
	
	@GetMapping("/love")
	public String onFamilyDto(Model model) {
		System.out.println("Running onFamilyDto");
		FamilyDto dto=new FamilyDto();
	    dto.setName("Uday");
	    dto.setFatherName("Revanna");
	    dto.setMotherName("Meena");
	    dto.setSisterName("Archana");
	    dto.setBrotherName("Shrenivash");
	    dto.setGrandFatherName("Hanumantappa");
	    dto.setGrandmotherName("Parvathi");
	    dto.setTotalNoOfPeople(6);
	    dto.setHouseLocation("A Rangapura");
	    dto.setAnyLand(false);
		
		model.addAttribute("family",dto);
		return "index.jsp";
		
	}

	@GetMapping("/world")
	public String onMobileDto(Model model) {
		System.out.println("Running onMobileDto");
		MobileDto dto=new MobileDto();
	    dto.setName("Redmi note 5 pro");
	    dto.setBrand("Redmi");
	    dto.setColour("Black");
	    dto.setPrice(15000);
	    dto.setModelName("note7");
	    model.addAttribute("mobile",dto);
		return "index.jsp";
		
	}
	
	@GetMapping("/cool")
	public String onBevarageDto(Model model) {
		System.out.println("Running onBevarageDto");
		BevarageDto dto=new BevarageDto();
	    dto.setName("pepsi");
	    dto.setBrand("pepsi");
	    dto.setPrice(150);
	    dto.setQuality(false);
	    dto.setQuantity(5);
	    dto.setBrandAmbasitorName("Kohli");
	    dto.setTeast(true);
	    dto.setGood("yes");
	    model.addAttribute("paniya",dto);
		return "index.jsp";
		
	}
	@GetMapping("/paani")
	public String onChatsDto(Model model) {
		System.out.println("Running onChatsDto");
		ChatsDto dto=new ChatsDto();
	    dto.setName("Goobi Manchuri");
	    dto.setShopName("Jeeva chats");
	    dto.setShopLocation("Rajajinagar");
	    dto.setPrice(50);
	    dto.setQuality(false);
	    dto.setGoodForHealth(false);
	    dto.setNoOfItems(12);
	    dto.setTeast(false);
	    dto.setColour("red");
	    dto.setNoOfVarieties(12);
	    dto.setFlevor("Pannir");
	    model.addAttribute("goobi",dto);
		return "index.jsp";
		
	}

}
