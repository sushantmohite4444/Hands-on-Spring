package com.collection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Employees {
	private int id;
	private String name;
	private List<Integer> phone;
	private Set<String> address;
	private Map<String, String> course;
	private Properties p;
	
	public Employees() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employees(int id, String name, List<Integer> phone, Set<String> address, Map<String, String> course,
			Properties p) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.address = address;
		this.course = course;
		this.p = p;
	}
	
	@Override
	public String toString() {
		return "Employees [id=" + id + ", name=" + name + ", phone=" + phone + ", address=" + address + ", course="
				+ course + ", p=" + p + "]";
	}
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
	public List<Integer> getPhone() {
		return phone;
	}
	public void setPhone(List<Integer> phone) {
		this.phone = phone;
	}
	public Set<String> getAddress() {
		return address;
	}
	public void setAddress(Set<String> address) {
		this.address = address;
	}
	public Map<String, String> getCourse() {
		return course;
	}
	public void setCourse(Map<String, String> course) {
		this.course = course;
	}
	public Properties getP() {
		return p;
	}
	public void setP(Properties p) {
		this.p = p;
	}

}
