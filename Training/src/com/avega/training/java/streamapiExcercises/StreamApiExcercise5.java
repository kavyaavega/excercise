package com.avega.training.java.streamapiExcercises;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//5. Given a list of strings, return a new list that contains only the strings that start with the letter "A".
public class StreamApiExcercise5 {

	public static void main(String[] args) {
		List<String> originalList = Arrays.asList("apple", "aeroplane", "bears", "elephants", "rhinos");
		List<String> resultList = originalList.stream()
		                                      .filter(s -> s.startsWith("a"))
		                                      .collect(Collectors.toList());
                    System.out.println(resultList);
	}

}
