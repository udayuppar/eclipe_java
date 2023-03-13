package com.xworkz.fruits.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class FruitsDto {

	private int id;
	
	@Size(min = 3,max = 20,message = "name Should be more than 3 and less than 20")
	private String name;
	
	@NotBlank(message = "Select fruits must be selected")
	private String selectFruits;
	
	@NotNull
	private Integer quantity;
	
	@Size(min = 3,max = 20,message = "location Should be more than 3 and less than 20")
	private String location;
	
	@NotNull
	private Long mobileNumber;

}
