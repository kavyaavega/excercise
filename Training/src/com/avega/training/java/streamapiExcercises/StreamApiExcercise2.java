package com.avega.training.java.streamapiExcercises;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//2. Given a list of strings, return a new list that contains only the strings that have a length greater than 5.
public class StreamApiExcercise2 {
	public static void main(String[] args) {
		
		List<String> originalList = Arrays.asList("cat", "dog", "rabbit", "elephant");
		List<String> resultList = originalList.stream()
		                                      .filter(s -> s.length() > 3)
		                                      .collect(Collectors.toList());
              System.out.println(resultList);
		
	}
	

}
