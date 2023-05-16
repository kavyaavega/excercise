package com.avega.training.java.streamapiExcercises;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//11. Given a list of strings, return a new list that contains only the strings that contain the letter "e".
public class StreamApiExcercise11 {

	public static void main(String[] args) {
		List<String> originalList = Arrays.asList("apple", "aeroplane", "bears", "elephants", "rhinos");
		List<String> resultList = originalList.stream()
		                                      .filter(s -> s.contains("e"))
		                                      .collect(Collectors.toList());
                    System.out.println(resultList);
	}

}
