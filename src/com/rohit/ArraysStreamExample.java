package com.rohit;

import java.util.Arrays;
import java.util.stream.Stream;

public class ArraysStreamExample {

	public static void main(String[] args) {
				
		// The stream(T[] array) method of Arrays class in Java, is used to 
		// get a Sequential Stream from the array passed as the 
		// parameter with its elements. It returns a sequential Stream with the 
		// elements of the array, passed as parameter, as its source.
		
		String [] str= {"Rohit","Paani","Venu"};
		
		Stream<String> stream=Arrays.stream(str);
		
		stream.forEach(System.out :: println);

	}

}
