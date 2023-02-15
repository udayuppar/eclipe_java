package com.xworkz.valentine.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="valentine_table")
public class ValentineEntity {
	
	@Id
	@Column(name="v_id")
	private int id;
	@Column(name="v_name")
	private String name;
	@Column(name="v_valentine")
	private String valentine;
	@Column(name="v_place")
	private String place;
	@Column(name="v_gift")
	private String gift;
	

}
