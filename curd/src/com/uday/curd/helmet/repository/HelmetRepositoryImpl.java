package com.uday.curd.helmet.repository;

import com.uday.curd.helmet.DTO.HelmetDTO;

public class HelmetRepositoryImpl implements HelmetRepository {
	
	private HelmetDTO[] helmets=new HelmetDTO[10];
	private int index=0;
	
	@Override
	public boolean createAndSave(HelmetDTO helmet) {
		System.out.println("Running createAndSave.....:"+helmet);
		if(this.index<=this.helmets.length) {
			System.out.println("Runnning...");
		}
		this.helmets[this.index]=helmet;
		System.out.println("Save:"+helmet+"Index:"+this.index);
		this.index++;
		return HelmetRepository.super.createAndSave(helmet);
	}

}
