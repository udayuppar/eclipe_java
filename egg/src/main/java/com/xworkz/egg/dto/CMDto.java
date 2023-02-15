package com.xworkz.egg.dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data

public class CMDto {
	
	@NotNull(message = "CM name cannot be null or blank")
	@Size(min=3, max=20 ,message = "CM name less than 3 and  more than 20")
	private String cmName;
	@NotBlank(message = "party can not be blank")
	private String party;
	@NotBlank(message = "state can not be blank")
	private String state;
	@NotNull
	@Min(value=1,message = "tenure cannot be less than 1")
	private Integer tenure;
	@NotBlank(message = "portFolio can not be blank")
	private String portFolio;
	
	

}
