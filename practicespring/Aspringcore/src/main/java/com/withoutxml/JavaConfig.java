package com.withoutxml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration


@ComponentScan(basePackages="com.withoutxml")
public class JavaConfig {
	
	@Bean
	public Address sendAddress() {
		
		
		return new Address();
		
		
	}
	
	
	
	
//  create bean
//	@Bean ("stud1")
	@Bean(name={"adddd","remove","display"})
//	@Bean
	public Student1 getStudent1() {
		return new Student1("sushant", "1", sendAddress());
	}
	
}
