package com.avega.training.java.streamapiExcercises;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

//3. Given a list of integers, return the maximum value.
public class StreamApiExcercise3 {

	public static void main(String[] args) {
		
		List<Integer> originalList = Arrays.asList(340, 400, 550, 600, 700);
		int max = originalList
	                .stream()
	                .mapToInt(Integer::intValue)
					  .max().orElse(0);
		
		System.out.println(max);

	}

}
