package com.xworkz.bigBasket.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class BigBasketDto {
	@Size(min = 3, max = 20, message = "name should be mora than 3 and less than 20")
	private String name;
	@Size(min = 3, max = 20, message = "Owner Name should be mora than 3 and less than 20")
	private String ownerName;
	@NotBlank(message = "email is invalid")
	private String email;
	@NotBlank()
	private String passWord;
	@NotBlank(message = "list Shold be selected")
	private String list;
	@NotBlank(message = "area shold be selected")
	private String area;
	@NotNull(message = "shopNumber shold be selected")

	private Integer shopNumber;
	@NotNull(message = "mobileNumber shold be selected")
	private Long mobileNumber;
	@Size(min = 3, max = 20, message = "Wife Name should be mora than 3 and less than 20")
	private String wifeName;
	@NotNull(message = "anualIncome shold be selected")
	private Double anualIncome;

}
