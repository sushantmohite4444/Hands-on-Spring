package com.reference;

public class Employees {
	private int id;
	private String name;
	private Address eAddress;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address geteAddress() {
		return eAddress;
	}
	public void seteAddress(Address eAddress) {
		this.eAddress = eAddress;
	}
	public Employees(int id, String name, Address eAddress) {
		super();
		this.id = id;
		this.name = name;
		this.eAddress = eAddress;
	}
	public Employees() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employees [id=" + id + ", name=" + name + ", eAddress=" + eAddress + "]";
	}
	
	

}
