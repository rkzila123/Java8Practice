package com.rohit;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamOfAndArrayStreamDifference {
	
	
	
	// In case of primitive to get element of Stream.of() we need to 
	// call flatMapToInt(Arrays:: stream) method for mapping .

	public static void main(String[] args) {

		
		int[] intArry= {2,4,6,8,10};
		
		Stream<int[]> stream=Stream.of(intArry);
		
		IntStream iStream=Arrays.stream(intArry);
		
		//stream.forEach(System.out::println);
		iStream.forEach(System.out::println);
		
		IntStream forStreamOf=stream.flatMapToInt(Arrays :: stream);
		forStreamOf.forEach(System.out::println);
		
	}
	
	

}
