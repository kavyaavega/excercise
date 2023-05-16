package com.avega.training.java.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//14. Given a list of strings, return a new list that contains only the strings that are palindromes and have an odd length.
public class StreamApiExample14 {

	public static void main(String[] args) {
		
		List<String> inputList = Arrays.asList("racecar", "deified", "Java", "radar", "Kayak", "programming");
		List<String> resultList = inputList.stream()
		        .filter(str -> str.length() % 2 != 0 && str.equalsIgnoreCase(new StringBuilder(str).reverse().toString()))
		        .collect(Collectors.toList());
		System.out.println(resultList); 

	}

}
