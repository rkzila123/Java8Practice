package com.rohit;

import java.util.stream.Stream;

public class StreamOfMethodExample {

	public static void main(String[] args) {
		

		
		// The Stream of(T… values) returns a sequential ordered stream whose elements
		// are the specified values. Stream.of() method simply calls
		// the Arrays.stream() method for non-primitive types.
		
		
		Stream stream =Stream.of("Rohit","Paani","Venu");
		
		stream.forEach(System.out::println);
		

	}

}
