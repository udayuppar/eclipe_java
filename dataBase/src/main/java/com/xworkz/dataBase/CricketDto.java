package com.xworkz.dataBase;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cricket_table")
public class CricketDto {
	
	@Column(name = "c_id")
	@Id
	private int id;
	@Column(name = "c_name")
	private String name;
	@Column(name = "c_captan_namem")
	private String captanName;
	@Column(name = "c_best_player")
	private String bestPlayer;
	
	

}
