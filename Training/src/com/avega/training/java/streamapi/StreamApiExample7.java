package com.avega.training.java.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//7. Given a list of strings, return a new list that contains only the strings that end with the letter "s".
public class StreamApiExample7 {

	public static void main(String[] args) {
		List<String> originalList = Arrays.asList("dogs", "cats", "bears", "elephants", "rhinos");
		List<String> resultList =originalList.stream().filter(s -> s.endsWith("s"))                                      .filter(s -> s.endsWith("s"))
                .collect(Collectors.toList());
		System.out.println(resultList);

	}

}
