package com.xworkz.egg.configuration;

import java.util.Arrays;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;



public class EggWebInit extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer {

	
	public EggWebInit() {
		System.out.println("Create:"+this.getClass().getSimpleName());
	}
	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("getRootConfigClasses");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("getServletConfigClasses");
		Class[] configClass= {EggConfiguration.class};
		System.out.println("Config class:"+Arrays.toString(configClass));
		return configClass;
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("getServletMappings");
		String[] ref= {"/"};
		System.out.println("getServletMappings:"+Arrays.toString(ref));
		return ref;
	}
	
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		System.out.println("configureDefaultServletHandling");
		configurer.enable();
	}

}
