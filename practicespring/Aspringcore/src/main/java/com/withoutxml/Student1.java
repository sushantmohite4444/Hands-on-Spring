package com.withoutxml;

import org.springframework.beans.factory.annotation.Value;

public class Student1 {

	private String name;
	
	private String id;
	
	private Address address;
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Student1(String name, String id, Address address) {
		super();
		this.name = name;
		this.id = id;
		this.address = address;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Student1 [name=" + name + ", id=" + id + ", address=" + address + "]";
	}
	
	


	
}
