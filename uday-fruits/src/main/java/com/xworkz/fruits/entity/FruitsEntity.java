package com.xworkz.fruits.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name="fruits_table")
@NamedQuery(name = "findByName", query = "select fruit from FruitsEntity fruit where fruit.name=:fruty ")
@NamedQuery(name = "findByNameAndMobileNumberAndLocation", query = "select apple from FruitsEntity apple  where apple.location=:loc")
public class FruitsEntity {
	
	@Id
	@Column(name="f_id")
	private int id;
	@Column(name="f_name")
	private String name;
	@Column(name="f_selectFruits")
	private String selectFruits;
	@Column(name="f_quantity")
	private Integer quantity;
	@Column(name="f_location")
	private String location;
	@Column(name="f_mobileNumber")
	private Long mobileNumber;

}
