package com.avega.training.java.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//4. Given a list of integers, return a new list that contains only the prime numbers.
public class StreamApiExample4 {
	public static void main(String[] args) {
		
		List<Integer> originalList = Arrays.asList(2, 4, 5, 7, 9, 10, 11, 13);
		List<Integer> resultList = originalList.stream()
                .filter(n -> IntStream.rangeClosed(2, (int) Math.sqrt(n))
                .allMatch(i -> n % i != 0)).collect(Collectors.toList());
		System.out.println(resultList);

	}

}
