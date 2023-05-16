package com.avega.training.java.streamapiExcercises;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//1. Given a list of integers, find the sum of all the even numbers.List<Integer> originalList = Arrays.asList(3, 4, 5, 6, 7);
public class StreamApiExcercise1 {

	public static void main(String[] args) {
		List<Integer> originalList = Arrays.asList(3, 4, 5, 6, 7);
		Integer sum = originalList.stream()
				  .mapToInt(Integer::intValue)
				  .sum();
                System.out.println(sum);

	}

}
