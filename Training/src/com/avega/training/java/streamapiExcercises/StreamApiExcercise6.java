package com.avega.training.java.streamapiExcercises;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

//6. Given a list of integers, return a new list that contains only the even numbers and double each number.
public class StreamApiExcercise6 {

	public static void main(String[] args) {
		List<Integer> originalList = Arrays.asList(4, 9, 2, 6);
		List<Integer> resultList = originalList.stream()
		                                      .filter(n -> n % 2 == 0)
		                                      .map(x -> x + x)
		                                      .collect(Collectors.toList());

		System.out.println(resultList);
	}

}
