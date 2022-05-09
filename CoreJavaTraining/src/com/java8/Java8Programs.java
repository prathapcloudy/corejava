package com.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class Java8Programs {

	public static void main(String[] args) {

	}

}

class Customer1 {

	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Customer1(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	

	@Override
	public String toString() {
		return "Customer1 [name=" + name + ", age=" + age + "]";
	}

	public static void main(String[] args) {
		List<Customer1> cusList = createCustomerList();
		// Quest 1.Given a list of employees, you need to filter all the employee
		// whose age is greater than 20 and print the employee names.(Java 8 APIs only)
		List<String> newCusList = cusList.stream().filter(e -> e.getAge() > 33).map(Customer1::getName)
				.collect(Collectors.toList());

		newCusList.forEach(name -> System.out.println(name));

		System.out.println("==============");
		// Given the list of employees, count number of employees with age 45?

		long count = cusList.stream()
				.filter(e -> e.getAge() == 45)
				//.map(Customer1::getName)
				.count();

		System.out.println(count);
		
		System.out.println("==============");
		//Given the list of employees, find the employee with name “prathap”.
		
		Optional<Customer1> newCus = cusList.stream()
				.filter(e -> e.getName().equalsIgnoreCase("prathap"))
				.findAny();
				
			if(newCus.isPresent()) {
			System.out.println(newCus.get().name);
			}	
			System.out.println("==============");
		//Given a list of employee, find maximum age of customer?
			
	     OptionalInt newCus3 = cusList.stream()
	    		  .mapToInt(Customer1::getAge)
	    		  .max();
	    		 // .map(Customer1::getName)
				 // .collect(Collectors.toList());
	     if(newCus3.isPresent()) {
	    	 System.out.println("max employee age is " + newCus3.getAsInt());
	     }
	     System.out.println("==============");
	     //Given a list of employees, sort all the employee on the basis of age?
	     
	      cusList.sort((e1,e3) -> e1.getAge() - e3.getAge());
	      cusList.forEach(System.out::println);
	    
//	    List result = cusList.stream().sorted((o1, o2)->o1.getAge().
//                compareTo(o2.getAge()));
//                collect(Collectors.toList());
	    // .collet(Collectors.toList());
	   
			
	}
	

	public static List<Customer1> createCustomerList() {

		List<Customer1> cus = new ArrayList<Customer1>();
		cus.add(new Customer1("prathap", 33));
		cus.add(new Customer1("nisha", 55));
		cus.add(new Customer1("ravi", 45));

		return cus;
	}
}
