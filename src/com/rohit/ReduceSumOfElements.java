package com.rohit;

import java.util.Arrays;
import java.util.List;

public class ReduceSumOfElements {

	public static void main(String[] args) {

		List<Integer> list=Arrays.asList(-2,4,6,10,12);
		
		int result=list.stream().reduce(0,(a,b)->(a+b));
		System.out.println("Sum is :: " + result);
		
	}

}
