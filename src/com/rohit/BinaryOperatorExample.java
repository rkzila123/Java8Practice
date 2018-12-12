package com.rohit;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {

	public static void main(String[] args) {
		
		Comparator<Integer> comparator = (a, b) -> (b.compareTo(a));
		
		Comparator<Integer> comparator1 = (a, b) -> a+b;
		Comparator<Integer> comparator2 = (a, b) -> a-b;

		// Using maxBy()
		BinaryOperator<Integer> opMax = BinaryOperator.maxBy(comparator);
		System.out.println("Max: " + opMax.apply(5, 6));
		System.out.println("Max: " + opMax.apply(9, 6));
		System.out.println("Max: " + opMax.apply(6, 5));
		System.out.println("Max: " + opMax.apply(6, 9));

		// Using minBy()
		BinaryOperator<Integer> opMin = BinaryOperator.minBy(comparator);
		System.out.println("Min: " + opMin.apply(5, 6));
		System.out.println("Min: " + opMin.apply(9, 6));
		System.out.println("Min: " + opMin.apply(6, 5));
		System.out.println("Min: " + opMin.apply(6, 9));
		//System.out.println("Min: " + opMin.apply(6, 6));
		
		BinaryOperator<Integer> max = BinaryOperator.maxBy(comparator1);
		System.out.println(max.apply(5, 6));
		
		BinaryOperator<Integer> max2 = BinaryOperator.maxBy(comparator2);
		System.out.println(max2.apply(5, 6));
		
		BinaryOperator<Integer> min = BinaryOperator.minBy(comparator1);
		System.out.println(max.apply(5, 6));
		
		BinaryOperator<Integer> min2 = BinaryOperator.minBy(comparator2);
		System.out.println(max2.apply(5, 6));
		
		
	}

}
