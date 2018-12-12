package com.rohit;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceMethodLongestString {

	public static void main(String[] args) {
				
		List<String> list=Arrays.asList("abc","abcd","abcde");
				
		// The result of the reduce() method is 
        // an Optional because the list on which 
        // reduce() is called may be empty. 
		
		Optional<String> options=list.stream().reduce((a,b)-> (a.length() >b.length() ? a :b));
		
		options.ifPresent(System.out :: println);

	}

}
