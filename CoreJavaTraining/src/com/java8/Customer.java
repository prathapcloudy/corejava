package com.java8;

public class Customer {
	
	
	private String name;
	private int age;
	
	public Customer(String name, int age) {
		this.setName(name);
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
