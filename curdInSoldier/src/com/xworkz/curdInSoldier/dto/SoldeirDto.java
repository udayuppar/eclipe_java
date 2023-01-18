package com.xworkz.curdInSoldier.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class SoldeirDto extends AbstractAuditDto {
	
	@NonNull
	@NotBlank
	@Size(min=3,max=20,message="Name is should be greater than 3 and less than 20")
	private String name;
	
	@Min(value=5,message="Id should be greater than 5 ")
	@Max(value=500,message="Id should be less tha 500")
	private int id;
	
	@NonNull
	@NotBlank
	@Size(min=3,max=20,message=" country Name is should be greater than 3 and less than 20")
	private String country;
	
	@NonNull
	@NotBlank
	@Size(min=3,max=20,message=" rank is should be greater than 3 and less than 20")
	private String rank;
	
	@NonNull
	@NotBlank
	@Size(min=3,max=20,message="specialist is should be greater than 3 and less than 20")
	private String specialist;
	

}
