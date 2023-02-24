package com.xworkz.aeroplane.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class AeroplaneDto {
	
	@NotBlank
	@Size(min=3,max = 20,message = "company should be more than 3 and less than 20")
	private String company;
	@NotBlank
	@Size(min=3,max = 20,message = "name should be more than 3 and less than 20")
	private String name;
	@NotNull(message = "cost not blank Plase fill the cost")
	private Double cost;
	@NotBlank(message = "type shoulb be selected")
	private String type;
	@NotBlank(message = "country shoulb be selected")
	private String country;

}
