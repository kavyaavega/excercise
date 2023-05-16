package com.avega.training.java.streamapiExcercises;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//13. Given a list of strings, return a new list that contains only the strings that are palindrome.
public class StreamApiExcercise13 {

	public static void main(String[] args) {
		List<String> inputList = Arrays.asList("madam","java","kayak");
		List<String> resultList = inputList.stream()
		        .filter(str -> str.equalsIgnoreCase(new StringBuilder(str).reverse().toString()))
		        .collect(Collectors.toList());
		System.out.println(resultList);

	}

}
