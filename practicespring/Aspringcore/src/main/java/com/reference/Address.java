package com.reference;



public class Address {
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}


	private String address;
	private String street ;

	

	

	public String getStreet() {
		return street;
	}


	public void setStreet(String street) {
		this.street = street;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}

	


	public Address(String address, String street) {
		super();
		this.address = address;
		this.street = street;
	}


	@Override
	public String toString() {
		return "Address [address=" + address + ", street=" + street + "]";
	}

	

	
	
	
}
