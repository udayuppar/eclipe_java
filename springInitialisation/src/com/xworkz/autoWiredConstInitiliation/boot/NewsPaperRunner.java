package com.xworkz.autoWiredConstInitiliation.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.autoWiredConstInitiliation.beans.NewsPaper;
import com.xworkz.autoWiredConstInitiliation.configuration.NewsPaperConfiguration;

public class NewsPaperRunner {

	public static void main(String[] args) {
		
		ApplicationContext container=new AnnotationConfigApplicationContext(NewsPaperConfiguration.class);
		String[] spring=container.getBeanDefinitionNames();
		System.out.println(Arrays.toString(spring));
		
		NewsPaper paper=container.getBean(NewsPaper.class);
		System.out.println(paper);
		
		NewsPaperConfiguration paper1=container.getBean(NewsPaperConfiguration.class);
		System.out.println(paper1.newsPaperLocation());
		
		
		

	}

}
