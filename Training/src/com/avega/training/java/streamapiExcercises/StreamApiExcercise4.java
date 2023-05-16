package com.avega.training.java.streamapiExcercises;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//4. Given a list of strings, return a new list that contains only the uppercase strings.
public class StreamApiExcercise4 {

	public static void main(String[] args) {
		List<String> originalList = Arrays.asList("mango", "apple", "grapes","Orange");
		List<String> resultList = originalList.stream()
		                                      .map(String::toUpperCase)
		                                      .collect(Collectors.toList());
        System.out.println(resultList);

	}

}
