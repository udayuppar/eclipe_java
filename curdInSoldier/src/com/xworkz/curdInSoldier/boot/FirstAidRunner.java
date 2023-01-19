package com.xworkz.curdInSoldier.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.curdInSoldier.configuration.SpringConfiguration;
import com.xworkz.curdInSoldier.dto.FirstAidDto;
import com.xworkz.curdInSoldier.dto.MissileDto;
import com.xworkz.curdInSoldier.dto.ResortDto;
import com.xworkz.curdInSoldier.service.FirstAidSurvice;
import com.xworkz.curdInSoldier.service.FirstAidSurviceImpl;
import com.xworkz.curdInSoldier.service.MissileSurvice;
import com.xworkz.curdInSoldier.service.ResortSurvice;

public class FirstAidRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext container= new AnnotationConfigApplicationContext(SpringConfiguration.class);
		String[] bean=container.getBeanDefinitionNames();
		System.out.println(Arrays.toString(bean));
		
		FirstAidSurvice survice=container.getBean(FirstAidSurvice.class);
		boolean saved=survice.validateAndSave(new FirstAidDto());
		System.out.println("Saved..."+saved);
		System.out.println(System.lineSeparator());
		
		ResortSurvice survice2=container.getBean(ResortSurvice.class);
		boolean saved2=survice2.validateAndSave(new ResortDto());
		System.out.println("Saved ...:"+saved2);
		System.out.println(System.lineSeparator());
		
		MissileSurvice service3=container.getBean(MissileSurvice.class );
		boolean saved3=service3.validateAndSave(new MissileDto());
		System.out.println("Saved....:"+saved3);

	}

}
