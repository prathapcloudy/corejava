package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Java8Streams {

	public static void main(String[] args) {

		
		List<Customer> customer = Arrays.asList(
				new Customer("prathap",30),
				new Customer("dani",30),
				new Customer("arun",31),
				new Customer("vijay",34));
		
		String name = customer.stream()
		.filter(cus -> "prathap".equals(cus.getName()))
		.map(Customer::getName)
		.findAny()
		.orElse(null);
		
		System.out.println(name);
		
		List<String> cust1 =  customer.stream().map(Customer::getName).collect(Collectors.toList());
		cust1.forEach(System.out :: println);
				
		
		
	}

}
