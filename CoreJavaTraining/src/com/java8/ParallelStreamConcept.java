package com.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ParallelStreamConcept {

	public static void main(String[] args) {
	
		ForkJoinPool cores =ForkJoinPool.commonPool();
		System.out.println(cores.getParallelism());
	
		//1. parallel() method on stream
		Stream stream = Stream.of("prathap","vincent","arun","apsar","Amar");
		
		Stream.of("prathap","vincent","arun","apsar","Amar").forEach(System.out::println);
		System.out.println("---------------");
		Stream.of("prathap","vincent","arun","apsar","Amar").parallel().forEach(System.out::println);
		
        //2.use parellelStream method on collection stream
		System.out.println("---------------");
		Arrays.asList("prathap","vincent","arun","apsar","Amar").parallelStream().forEach(System.out::println);
				
		System.out.println("---------------Stream with alphabates");
		
		getAlphabates().stream().forEach(System.out::println);
		System.out.println("---------------Stream with alphabates");
		getAlphabates().parallelStream().forEach(System.out::println);
		
		//check stream is running in parallel mode : isParallel() method 
		System.out.println("---------------check stream is parellel or not");
		IntStream intst = IntStream.range(1, 10);
		System.out.println(intst.isParallel());
		
		IntStream intst1 = IntStream.range(1, 10);
		intst1.parallel();
		System.out.println(intst1.isParallel());
		
		
	}
	
	  public static List<String> getAlphabates()
	  {
		  
		  List<String> alpha = new ArrayList<String>();
		  int n = 97;
		  
		  while(n <= 122) {
			  
			  char c = (char)n;
			   alpha.add(String.valueOf(c));
			   n++;
		  }
		  return alpha;
		  
	  }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	
}
