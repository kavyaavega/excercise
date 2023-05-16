package com.avega.training.java.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//2. Given a list of integers, return a new list that contains the absolute value of each number.
public class StreamApiExample2 {
	public static void main(String[] args) {
		
	List<Integer> originalList = Arrays.asList(-3, 5, 0, -8, 4);
		
	List<Integer> resultList = originalList.stream() .map(Math::abs)
            .collect(Collectors.toList());
	System.out.println(resultList);
	
		
	}

}
