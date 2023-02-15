package com.xworkz.egg.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.egg.dto.EggDto;
import com.xworkz.egg.repository.EggRepository;

@Service
public class EggServiceImpl implements EggService {
	@Autowired
	private EggRepository repository;
	
	public EggServiceImpl() {
		System.out.println("Create:"+this.getClass().getSimpleName());
	}

	@Override
	public boolean validateAndSave(EggDto dto) {
		System.out.println("Running validateAndSave"+dto);
		boolean saved=repository.save(dto);
		System.out.println("saved:"+saved);
		return false;
	}

}
