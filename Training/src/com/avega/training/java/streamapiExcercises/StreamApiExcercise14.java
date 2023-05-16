package com.avega.training.java.streamapiExcercises;

import java.util.Arrays;
import java.util.List;

//14. Given a list of integers, return the product of all the numbers.
public class StreamApiExcercise14 {

	public static void main(String[] args) {
		
		List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
		Integer sum = integers.stream()
		  .reduce(1, Integer::sum);
		System.out.println(sum);
	
	}

}
