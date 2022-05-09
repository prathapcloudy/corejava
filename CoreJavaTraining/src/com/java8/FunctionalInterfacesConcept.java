package com.java8;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class FunctionalInterfacesConcept {

	public static void main(String[] args) {
		// Represents an operation upon two operands of the same type, producing a result
		// of the same type as the operands. This is a specialization of
		// for the case where the operands and the result are all of
		// the same type.

		BinaryOperator<Integer> func = (x1, x3) -> x1 + x3;
		int intVal = func.apply(30, 40);
		System.out.println(intVal);
  
		BiFunction<Integer, Integer, Integer> func1 = (x1, x3) -> x1 + x3;
		int intValues = func.apply(60, 40);
		System.out.println(intValues);
	}

}
