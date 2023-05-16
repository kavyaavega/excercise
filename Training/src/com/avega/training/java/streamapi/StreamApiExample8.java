package com.avega.training.java.streamapi;

import java.util.Arrays;
import java.util.List;

//8. Given a list of integers, return the average value
public class StreamApiExample8 {

	public static void main(String[] args) {
		List<Integer> originalList = Arrays.asList(3, 4, 5, 6, 7);
		double average = originalList.stream()
		                             .mapToInt(Integer::intValue)
		                             .average()
		                             .orElse(Double.NaN);

		System.out.println(average);

	}

}
