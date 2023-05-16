package com.avega.training.java.streamapi;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

//Given a list of strings, return a new list that contains the strings in reverse order.
public class StreamApiExample3 {
	public static void main(String[] args) {
		List<String> originalList = Arrays.asList("cat", "dog", "bird", "lion");
		
		List<String> resultList = originalList.stream()
	            .sorted(Collections.reverseOrder()).collect(Collectors.toList());
		System.out.println(resultList);
	}

}
