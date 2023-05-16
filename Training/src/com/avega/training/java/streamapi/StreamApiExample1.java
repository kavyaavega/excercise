package com.avega.training.java.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//1. Given a list of strings, return a new list that contains only the strings that have a length of 3.
public class StreamApiExample1 {
	
	public static void main(String[] args) {
	
	List<String> originalList = Arrays.asList("cat", "dog", "bird", "lion");
	List<String> resultList = originalList.stream()
            .filter(s -> s.length() == 3).collect(Collectors.toList());
	System.out.println(resultList);
	
	}

}
