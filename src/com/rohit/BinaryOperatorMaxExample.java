package com.rohit;

import java.util.function.BinaryOperator;

public class BinaryOperatorMaxExample {

	public static void main(String[] args) {
		
		// A negative integer, zero, or a positive integer as the first argument is less than, equal to, or greater than the second.
		// Inside maxBy() method we need to implement compare ()
		// Returns a BinaryOperator which returns the greater of two elements according to the specified Comparator.

		BinaryOperator<Integer> 
        op1 = BinaryOperator 
                 .maxBy( 
                     (a, b) -> (a > b) ? 1 : ((a == b) ? 0 : -1)); 
		 
		System.out.println(op1.apply(98, 11)); 
		
		
		
		BinaryOperator<Integer>   op2 = BinaryOperator 
				.maxBy( 
						(a, b) -> {
							if(a > b) {
								System.out.println("Inside a > b");
								return 1;
							} else {
								if(a==b) {
									System.out.println("Inside a == b");
									return 0;
								} else {
									System.out.println("Inside a < b");
									return -1;
								}
							}
						});
		System.out.println(op2.apply(98, 11)); 
	}

}
