package com.avega.training.java.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//6. Given a list of integers, return a new list that contains the square root of each number

public class StreamApiExample6 {
	public static void main(String[] args) {
		List<Integer> originalList = Arrays.asList(4, 9, 16, 25);
		List<Double> resultList = originalList.stream()
		  .map(Math::sqrt).collect(Collectors.toList());
		System.out.println(resultList);

	}
	


}
