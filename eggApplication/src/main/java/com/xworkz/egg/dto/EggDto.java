package com.xworkz.egg.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="egg_table")
public class EggDto {
	
	@Id
	@Column(name="c_id")
	private int id;
	@Column(name="c_hotel_name")
	private String hotelName;
	@Column(name="c_dish_name")
	private String dishName;
	@Column(name="c_egg_type")
	private String eggType;
	@Column(name="c_price")
	private Double price;
	@Column(name="c_quantity")
	private Integer quantity;
	@Column(name="c_takeAway")
	private Boolean takeAway;
}
