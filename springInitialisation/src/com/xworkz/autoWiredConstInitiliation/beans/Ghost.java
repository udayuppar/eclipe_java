package com.xworkz.autoWiredConstInitiliation.beans;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Ghost {
	
	@Autowired
	@Qualifier("ghostName")
	private String name;
	@Autowired
	@Qualifier("ghostGender")
	private String gender;
	@Autowired
	@Qualifier("ghostDeathDate")
	private LocalDate deathDate;
	@Autowired
	@Qualifier("ghostBirthDate")
	private LocalDate birthDate;
	@Autowired
	@Qualifier("ghostDeathLocation")
	private String deathLocation;
	@Autowired
	@Qualifier("ghostReason")
	private String reason;
	@Autowired
	@Qualifier("ghostAlive")
	private String aliveIn;
	@Autowired
	@Qualifier("ghostNailLength")
	private float nailLength;
	@Autowired
	@Qualifier("ghostDressCode")
	private String dressCode;
	@Autowired
	@Qualifier("ghostfreindName")
	private String bestFriendName;
	private float hairLength;
	private boolean married;
	private String wifeName;
	private String enemyName;
	private int ghostId;
	private double adharNumber;
	private String fatherName;
	private String motherName;
	private boolean dangerous;
	private boolean handsome;
	
	
	


	public Ghost(@Qualifier("ghostHair") float hairLength, @Qualifier("ghostMarried")boolean married, @Qualifier("ghostWifeName")String wifeName,@Qualifier("ghostEnemy") String enemyName, @Qualifier("ghostId")int ghostId, @Qualifier("ghostAdhar")double adharNumber,
			@Qualifier("ghostFather")String fatherName,@Qualifier("ghostMother") String motherName,@Qualifier("ghostDangerous") boolean dangerous,@Qualifier("ghostHandsome") boolean handsome) {
		super();
		this.hairLength = hairLength;
		this.married = married;
		this.wifeName = wifeName;
		this.enemyName = enemyName;
		this.ghostId = ghostId;
		this.adharNumber = adharNumber;
		this.fatherName = fatherName;
		this.motherName = motherName;
		this.dangerous = dangerous;
		this.handsome = handsome;
	}


	@Override
	public String toString() {
		return "Ghost [name=" + name + ", gender=" + gender + ", deathDate=" + deathDate + ", birthDate=" + birthDate
				+ ", deathLocation=" + deathLocation + ", reason=" + reason + ", aliveIn=" + aliveIn + ", nailLength="
				+ nailLength + ", dressCode=" + dressCode + ", bestFriendName=" + bestFriendName + ", hairLength="
				+ hairLength + ", married=" + married + ", wifeName=" + wifeName + ", enemyName=" + enemyName
				+ ", ghostId=" + ghostId + ", adharNumber=" + adharNumber + ", fatherName=" + fatherName
				+ ", motherName=" + motherName + ", dangerous=" + dangerous + ", handsome=" + handsome + "]";
	}
	
	
	
	
	

}
