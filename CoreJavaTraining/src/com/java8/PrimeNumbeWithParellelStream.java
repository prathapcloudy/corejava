package com.java8;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimeNumbeWithParellelStream {

	public static void main(String[] args) {
		// TODO Auto-generated method st  ub 
		
		var x =10;
		
		long count = Stream.iterate(0, n -> n+1)
		.limit(100)
		.filter(PrimeNumbeWithParellelStream::isPrime)
	//	.peek(x ->System.out.println(x))
	    .count();
	//	System.out.println("Total prime num is " + count);
		
		
		//==================================================
		//Infinite Streams are used to generate infinite stream of data
		//1.iterate() 1.generate()  example 
		List<Integer> collect =  IntStream.iterate(0, n -> n+1)
		.mapToObj(Integer:: valueOf)
		.limit(10)
		.collect(Collectors.toList());
		 collect.forEach(System.out::println);
		
		
		List<Integer> coll =  Stream.generate(() -> (new Random()).nextInt(100))
				.limit(10)
				.collect(Collectors.toList());
		System.out.println(coll);
	}
	
	public static Boolean isPrime(int number) {
		
		if(number <=1) return false;
	     return !IntStream.rangeClosed(2, number/2).anyMatch(x -> number%x ==0);
	}

}
