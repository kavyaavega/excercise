package com.avega.training.java.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//9. Given a list of strings, return a new list that contains only the strings that are longer than their position in the list
public class StreamApiExample9 {

	public static void main(String[] args) {
		List<String> inputList = Arrays.asList("Java", "is", "a", "programming", "language");

		List<String> resultList = IntStream.range(0, inputList.size())
		        .filter(i -> inputList.get(i).length() > i)
		        .mapToObj(inputList::get)
		        .collect(Collectors.toList());

		System.out.println(resultList);


	}

}
