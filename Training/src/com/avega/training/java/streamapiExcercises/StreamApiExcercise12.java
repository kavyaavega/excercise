package com.avega.training.java.streamapiExcercises;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

//12. Given a list of integers, return a new list that contains the square of each number.
public class StreamApiExcercise12 {

	public static void main(String[] args) {
		List<Integer> originalList = Arrays.asList(4, 9, 2, 5);
		Function<Integer, Integer> square = x -> x * x;
		List<Integer> squareNumbers = originalList.stream().map(square)
	            .collect(Collectors.toList());
			System.out.println(squareNumbers);	                             

	
	}

}
