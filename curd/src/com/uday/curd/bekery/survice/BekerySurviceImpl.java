package com.uday.curd.bekery.survice;

import com.uday.curd.bekery.DTO.BekeryDto;
import com.uday.curd.bekery.DTO.FamousFor;
import com.uday.curd.bekery.exceptions.InvalidDataException;
import com.uday.curd.bekery.repository.BekeryRepository;

public class BekerySurviceImpl implements BekerySurvice {

	private BekeryRepository repository;

	public BekerySurviceImpl(BekeryRepository repository) {
		this.repository = repository;
	}

	@Override
	public boolean validAndSave(BekeryDto dto) throws InvalidDataException {

		String name = dto.getName();
		String owner = dto.getOwner();
		String location = dto.getLocation();
		long contactNo = dto.getContactNo();
		FamousFor FamousFor = dto.getFamous();
		boolean nameis = false;
		boolean owneris = false;
		boolean locationis = false;
		boolean contactNois = false;
		boolean FamousForis = false;

		if (name != null && name.length() >= 4 && name.length() <= 20) {
			System.out.println("name is valid:" + name);
			nameis = true;
		} else {
			System.err.println("Name is invalid..:" + name);
		}
		if (owner != null && owner.length() >= 4 && owner.length() <= 20) {
			System.out.println("owner name is valid:" + owner);
			owneris = true;
		} else {
			System.err.println("owner Name is invalid..:" + owner);
		}
		if (location != null && location.length() >= 4 && location.length() <= 20) {
			System.out.println("location is valid:" + location);
			locationis = true;
		} else {
			System.err.println("location is invalid..:" + location);
		}
		if (contactNo == 8861539422l || contactNo == 9741627422l) {
			System.out.println("contactNo is valid:" + contactNo);
			contactNois = true;
		} else {
			System.err.println("contactNo is invalid..:" + contactNo);
		}

		if (FamousFor != null) {
			System.out.println("FamousFor is valid:" + FamousFor);
			FamousForis = true;
		} else {
			System.err.println("FamousFor is invalid..:" + FamousFor);

		}

		if (nameis && owneris && locationis && contactNois && FamousForis) {
			System.out.println("Dto is valid");
			boolean save = this.repository.storeAndSave(dto);
			System.out.println("Dto is saved :" + save);

		} else {
			throw new InvalidDataException("data is invalid....");
		}

		return false;
	}

}
