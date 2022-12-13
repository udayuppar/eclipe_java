package com.uday.curd.ipl.repositiory;

import java.time.LocalDateTime;

import com.uday.curd.ipl.dto.WarDTO;
import com.uday.curd.ipl.exceptions.IplExceptions;

public class WarRepositoryImpl implements WarRepository {

	
	private WarDTO[] wars=new WarDTO[10];
	private int index=0;
	
	@Override
	public boolean create(WarDTO dto) {
		System.out.println("Running created war:"+dto);
		if(this.index>=this.wars.length) {
			throw new IplExceptions();
			
		}
		this.wars[this.index]=dto;
		System.out.println("save:"+dto+"index:"+this.index);
		index++;
		
		
		return true;
	}

	@Override
	public boolean create(WarDTO[] wars) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int total() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public WarDTO findByStartedBy(String startedBy) {
		System.out.println("Running find by Started by ....");
		for (WarDTO warDTO : wars) {
			if(warDTO!=null && warDTO.getStartedBy().equals(startedBy)) {
				System.out.println("match found:"+warDTO);
				return warDTO;
			}
			else {
				System.err.println("match not found");
				return warDTO;
			}
			
		}
		return null;
	}

	@Override
	public WarDTO findByStartedByAndStartedWith(String startedBy, String startedWith) {
		System.out.println("Running findByStartedBy And StartedWith........ ");
		for (WarDTO warDTO2 : wars) {
			if(warDTO2!=null && warDTO2.getStartedBy().equals(startedBy) && warDTO2.getStartedWith().equals(startedWith))
			{
				System.out.println("match found:"+warDTO2);
				return warDTO2;
			}
			else {
				System.err.println("match not found");
				return warDTO2;
			}
			
		}
		return null;
	}

	@Override
	public WarDTO findByStartDateGreaterThanOrEqualTo(LocalDateTime startedDate) {
		System.out.println("Running findByStartDate GreaterThan Or EqualTo:"+startedDate);
		for (WarDTO warDTO3 : wars) {
			if(warDTO3 !=null &&  warDTO3.getStartDate().isAfter(startedDate)) {
				System.out.println("match found:"+startedDate);
				
				
			} else {
				System.err.println("match not fund");
			}
			
		}
		return null;
	}

	@Override
	public WarDTO findByStartDateLessarThanOrEqualTo(LocalDateTime date) {
		System.out.println("running findByStartDateLessarThanOrEqualTo:"+ date);
		for (WarDTO warDTO4 : wars) {
			if(warDTO4 !=null && warDTO4.getEndDate().isBefore(date)){
				System.out.println("Match found:"+date);
			}
			else
			{
				System.err.println("Match not found");
			}
		}
		return null;
	}

	@Override
	public WarDTO findByStartDateAndEndDate(LocalDateTime start, LocalDateTime end) {
		System.out.println("Running findByStartDateAndEndDate: "+start +end);
		
		for (WarDTO warDTO5 : wars) {
			if(warDTO5!=null) {
				System.out.println("Dto is matched:"+start+end);
			}
			else {
				System.out.println("Dto is not matched");
			}
			
		}
		return null;
	}
	

}
