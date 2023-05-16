package com.avega.training.java.streamapi;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

//5. Given a list of strings, return a new list that contains the strings in uppercase and sorted in reverse order.
public class StreamApiExample5 {
	public static void main(String[] args) {
List<String> originalList = Arrays.asList("apple", "Banana", "cherry", "date", "Orange");
		
		List<String> resultList = originalList.stream().map(String::toUpperCase)
	            .sorted(Collections.reverseOrder()).collect(Collectors.toList());
		System.out.println(resultList);
		
	}

}
