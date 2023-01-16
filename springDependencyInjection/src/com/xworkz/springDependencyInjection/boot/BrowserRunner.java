package com.xworkz.springDependencyInjection.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.springDependencyInjection.bean.Browser;
import com.xworkz.springDependencyInjection.bean.Chrome;
import com.xworkz.springDependencyInjection.bean.FireBox;
import com.xworkz.springDependencyInjection.configuration.BrowserConfiguration;

public class BrowserRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext container=new AnnotationConfigApplicationContext(BrowserConfiguration.class);
		String[] bean=	container.getBeanDefinitionNames();
		System.out.println(Arrays.toString(bean));
		
		Browser browser=container.getBean(Chrome.class);
		browser.browse();
		System.out.println(browser);
		
		Browser browser2=container.getBean(FireBox.class);
		browser2.browse();
		System.out.println(browser2);

	}

}
