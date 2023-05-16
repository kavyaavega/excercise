package com.avega.training.java.streamapi;

import java.util.Arrays;
import java.util.List;

//11. Given a list of strings, return a new list that contains the concatenation of all the strings.
public class StreamApiExample11 {

	public static void main(String[] args) {
		List<String> inputList = Arrays.asList("Java", "is", "a", "programming", "language");

		String resultString = inputList.stream()
		        .reduce("", String::concat);

		System.out.println(resultString);


	}

}
