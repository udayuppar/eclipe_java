package com.uday.curd.ipl.boot;

import java.time.LocalDateTime;

import com.uday.curd.ipl.dto.IplDto;
import com.uday.curd.ipl.repositiory.IplRepository;
import com.uday.curd.ipl.repositiory.IplRepositoryImpl;

public class IplRunner {

	public static void main(String[] args) {
		
		IplRepository impl=new IplRepositoryImpl();
		IplDto dto=new IplDto();
		dto.setTeamName("RCB");
		dto.setCaptainName("Virat");
		dto.setOwnerAlive(false);
		dto.setPurse(1000);
		dto.setWins(100);
		dto.setDefeats(1);
		dto.setCriatedBy("uday");
		dto.setCriatedDate(LocalDateTime.now());
		dto.setUpdatedBy("Ajay");
		dto.setUpdatedDate(LocalDateTime.now());
		impl.create(dto);
		System.out.println(System.lineSeparator());
		
		System.out.println(impl.findTeamName("RCB"));
		
		IplRepository impl2=new IplRepositoryImpl();
		IplDto dto2=new IplDto();
		dto2.setTeamName("Rajastan Royals");
		dto2.setCaptainName("Sanju");
		dto2.setOwnerAlive(false);
		dto2.setPurse(1000);
		dto2.setWins(15);
		dto2.setDefeats(5);
		dto2.setCriatedBy("Sandeep");
		dto2.setCriatedDate(LocalDateTime.now());
		dto2.setUpdatedBy("Ravi");
		dto2.setUpdatedDate(LocalDateTime.now());
		impl2.create(dto2);
		System.out.println(System.lineSeparator());
		
		IplRepository impl3=new IplRepositoryImpl();
		IplDto dto3=new IplDto();
		dto3.setTeamName("Delhi capitals");
		dto3.setCaptainName("Rishab");
		dto3.setOwnerAlive(false);
		dto3.setPurse(1000);
		dto3.setWins(15);
		dto3.setDefeats(5);
		dto3.setCriatedBy("Sandeep");
		dto3.setCriatedDate(LocalDateTime.now());
		dto3.setUpdatedBy("Ravi");
		dto3.setUpdatedDate(LocalDateTime.now());
		impl3.create(dto3);
		System.out.println(System.lineSeparator());
		
		IplRepository impl4=new IplRepositoryImpl();
		IplDto dto4=new IplDto();
		dto4.setTeamName("MI");
		dto4.setCaptainName("Rohit");
		dto4.setOwnerAlive(false);
		dto4.setPurse(1000);
		dto4.setWins(15);
		dto4.setDefeats(5);
		dto4.setCriatedBy("Sandeep");
		dto4.setCriatedDate(LocalDateTime.now());
		dto4.setUpdatedBy("Ravi");
		dto4.setUpdatedDate(LocalDateTime.now());
		impl4.create(dto4);
		System.out.println(System.lineSeparator());
		
		IplRepository impl5=new IplRepositoryImpl();
		IplDto dto5=new IplDto();
		dto5.setTeamName("CSK");
		dto5.setCaptainName("Dhoni");
		dto5.setOwnerAlive(false);
		dto5.setPurse(1000);
		dto5.setWins(15);
		dto5.setDefeats(5);
		dto5.setCriatedBy("Sandeep");
		dto5.setCriatedDate(LocalDateTime.now());
		dto5.setUpdatedBy("Ravi");
		dto5.setUpdatedDate(LocalDateTime.now());
		impl5.create(dto5);
		System.out.println(System.lineSeparator());
		
		IplRepository impl6=new IplRepositoryImpl();
		IplDto dto6=new IplDto();
		dto6.setTeamName("KKR");
		dto6.setCaptainName("Shreyas");
		dto6.setOwnerAlive(false);
		dto6.setPurse(1000);
		dto6.setWins(15);
		dto6.setDefeats(5);
		dto6.setCriatedBy("Sandeep");
		dto6.setCriatedDate(LocalDateTime.now());
		dto6.setUpdatedBy("Ravi");
		dto6.setUpdatedDate(LocalDateTime.now());
		impl6.create(dto6);
		System.out.println(System.lineSeparator());
		
		IplRepository impl7=new IplRepositoryImpl();
		IplDto dto7=new IplDto();
		dto7.setTeamName("GT");
		dto7.setCaptainName("Hardhik");
		dto7.setOwnerAlive(false);
		dto7.setPurse(1000);
		dto7.setWins(15);
		dto7.setDefeats(5);
		dto7.setCriatedBy("Sandeep");
		dto7.setCriatedDate(LocalDateTime.now());
		dto7.setUpdatedBy("Ravi");
		dto7.setUpdatedDate(LocalDateTime.now());
		impl7.create(dto7);
		System.out.println(System.lineSeparator());
		
		
	
	
		
		 

	}

}
