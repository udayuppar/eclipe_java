package com.xworkz.bakery.survice;

import org.springframework.stereotype.Service;

import com.xworkz.bakery.dto.BakaryDto;
import com.xworkz.bakery.repository.BakeryRepository;

@Service
public class BakerySurviceImpl implements BakerySurvice {

	private BakeryRepository repository;
	
	public BakerySurviceImpl() {
		System.out.println("Create:"+this.getClass().getSimpleName());
	}
	
	@Override
	public boolean validateAndSave(BakaryDto dto) {
		System.out.println("Running validateAndSave..."+dto);
		boolean saved=this.repository.save(dto);
		System.out.println("Dto saved....."+saved);
		return false;
	}

}
