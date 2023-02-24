package com.xworkz.bigBasket.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="big_basket_table")
public class BigBasketEntity {
	
	@Id
	@Column(name="b_id")
	private int id;
	@Column(name="b_name")
	private String name;
	@Column(name="b_ownerName")
	private String ownerName;
	@Column(name="b_email")
	private String email;
	@Column(name="b_passWord")
	private String passWord;
	@Column(name="b_list")
	private String list;
	@Column(name="b_area")
	private String area;
	@Column(name="b_shopNumber")
	private Integer shopNumber;
	@Column(name="b_mobileNumber")
	private Long mobileNumber;
	@Column(name="b_wifeName")
	private String wifeName;
	@Column(name="b_anualIncome")
	private Double anualIncome;

}
