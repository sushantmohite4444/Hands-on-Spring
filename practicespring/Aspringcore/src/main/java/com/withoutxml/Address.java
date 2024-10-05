package com.withoutxml;

import org.springframework.beans.factory.annotation.Value;

public class Address {
	@Value("st")
	private String street;

	@Override
	public String toString() {
		return "Address [street=" + street + "]";
	} 
	
	

}
