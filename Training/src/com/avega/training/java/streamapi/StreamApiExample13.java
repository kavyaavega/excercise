package com.avega.training.java.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//13. Given a list of strings, return a new list that contains only the strings that are composed entirely of uppercase letters.
public class StreamApiExample13 {

	public static void main(String[] args) {
		
		List<String> inputList = Arrays.asList("JAVA", "is", "a", "PROGRAMMING", "language");

		List<String> resultList = inputList.stream()
		        .filter(str -> str.matches("[A-Z]+"))
		        .collect(Collectors.toList());

		System.out.println(resultList);

	}

}
