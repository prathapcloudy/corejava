package com.java8;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SequentialStream {

	public static void main(String[] args) {
		
		//1.
		Stream stream = Stream.of("prathap","vincent","arun","apsar");
		
		//System.out.println(stream.distinct());
		//stream.forEach(System.out::println);
		stream.findFirst()
		.ifPresent(System.out::println);
		
		//2.
		Arrays.asList("a1","a2","a3")
		.stream()
		.findFirst()
		.ifPresent(System.out::println);
		
		//3. range: 1 to 5
		
		IntStream.range(0, 11).forEach(System.out::println);
		
		//
		Arrays.stream(new int[] {1,4,5,6,7})
		.map(a -> 3*a+1)
		.average()
		.ifPresent(System.out::println);
		
		//String data object
		
		Stream.of("a1","a2","a3")
		.map(s -> s.substring(1))
		.mapToInt(Integer::parseInt)
		.max()
		.ifPresent(System.out::println);
		
		//double to string value
		
		Stream.of(1.0,3.0,4.0)
		.mapToInt(Double::intValue)
		.mapToObj(a -> "b"+a)
		.forEach(System.out::println);
		
		//limit
		
		Stream.iterate(0, n -> n+1).limit(10).forEach(System.out::println);
		
		//odd number
		
		Stream.iterate(0, n -> n+1)
		.filter(x -> x%2 !=0)
		.limit(10)
		.forEach(System.out:: println);
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
