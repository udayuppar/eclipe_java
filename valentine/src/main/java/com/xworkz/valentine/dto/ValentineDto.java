package com.xworkz.valentine.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class ValentineDto {
	
	@Size(min = 3, max = 20,message = "name should be more than 3 and less than 20")
	private String name;
	@Size(min = 3, max = 20,message = "valentine should be more than 3 and less than 20")
	private String valentine;
	@NotBlank(message = "place should be selected")
	private String place;
	@NotBlank(message = "gift should be selected")
	private String gift;
	

}
