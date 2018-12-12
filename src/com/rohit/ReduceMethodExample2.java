package com.rohit;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceMethodExample2 {

	public static void main(String[] args) {
		
		List<String> list= Arrays.asList("Structure" ,"Financial" ,"Messaging","System");
		
		Optional<String> options=list.stream().reduce((a,b)->(a+"_"+b));
		
		//A container object which may or may not contain a non-null value.
		//If a value is present, isPresent() will return true and get() will return the value.
		
		if(options.isPresent()) {
			System.out.println(options.get());
		}

	}

}
