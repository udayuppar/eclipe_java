package com.xworkz.bigBasket.service;

import java.util.Collections;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.bigBasket.dto.BigBasketDto;
import com.xworkz.bigBasket.entity.BigBasketEntity;
import com.xworkz.bigBasket.repository.BigBasketRepository;

@Service
public class BigBasketServiceImpl implements BigBasketService {

	@Autowired
	private BigBasketRepository repository;

//	int count = 0;

	@Override
	public Set<ConstraintViolation<BigBasketDto>> validateAndSave(BigBasketDto dto) {
		System.out.println("Running validateAndSave in service "+dto);
		
		ValidatorFactory factory=Validation.buildDefaultValidatorFactory();
		Validator validator=factory.getValidator();
		Set<ConstraintViolation<BigBasketDto>> violations=validator.validate(dto);
		
		if(violations!=null && !violations.isEmpty()) {
		System.err.println("Violation in the dto"+dto);
//			
//			String str1=dto.getPassWord().substring(0, 1);
//			System.out.println(str1);
//			
//			String str2=dto.getPassWord().substring(2, 4);
//			System.out.println(str2);
//			
//
//			String str3=dto.getPassWord().substring(5, 8);
//			System.out.println(str3);
//			
//			int convertString=Integer.valueOf(str3);
//			System.out.println(convertString);
//			
//			if(dto.getPassWord().length()==8) {
//				if((str1.charAt(str1.length()-1)>='A' && str1.charAt(str1.length()-1)<='Z')
//					&& (str2.charAt(str2.length()-1)>='a'&& str2.charAt(str2.length()-1)<='z') 
//					&&(str3.charAt(str3.length()-1)>=0 && str3.charAt(str3.length()-1)<=9)){
//					count++;
//				}
//						
//						if(count==0) {
//							System.out.println("passWord is invalid");
//						}else {
//							System.out.println("passWord is valid");
//						}
//			}
			
			return violations;
		}
		
		else {
			System.out.println("there is no violation in the dto save the data"+dto);
			
			BigBasketEntity entity=new BigBasketEntity();
			entity.setName(dto.getName());
			entity.setOwnerName(dto.getOwnerName());
			entity.setEmail(dto.getEmail());
			entity.setPassWord(dto.getPassWord());
			entity.setList(dto.getList());
			entity.setArea(dto.getArea());
			entity.setShopNumber(dto.getShopNumber());
			entity.setMobileNumber(dto.getMobileNumber());
			entity.setWifeName(dto.getWifeName());
			entity.setAnualIncome(dto.getAnualIncome());
			boolean saved=this.repository.save(entity);
			System.out.println("data is saved "+saved);
			return Collections.emptySet();
		}
		
	
	}

}
