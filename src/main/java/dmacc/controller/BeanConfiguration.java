package dmacc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.beans.PCBuild;

@Configuration
public class BeanConfiguration {
	
	@Bean
	public PCBuild pcBuild() {
		PCBuild bean = new PCBuild("My PC Build");
//		bean.setName("Dr. Seuss");
//		bean.setPhone("555-555-5555");
//		bean.setRelationship("friend");
		return bean;
	}
}
