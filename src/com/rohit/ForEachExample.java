package com.rohit;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ForEachExample {

	public static void main(String[] args) {
		
		
		List<Integer> number=Arrays.asList(2,4,6,8,10);
		number.stream().forEach(y-> System.out.print(" " +y));
		
		for(int i=0;i<number.size();i++) {
			
				System.out.print(" " +number.get(i));
			
		}
		
		List result=number.stream().map(x->x*x).collect(Collectors.toList());
		result.stream().forEach(y-> System.out.print(" " +y));
		
		System.out.println();
		
		Set<Integer> set= new HashSet<Integer>();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.stream().forEach(y->System.out.println(y));

	}

}
