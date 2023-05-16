package com.avega.training.java.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//10. Given a list of integers, return a new list that contains only the numbers that are greater than their index in the list.
public class StreamApiExample10 {

	public static void main(String[] args) {
		
		List<Integer> inputList = Arrays.asList(5, 2, 7, 1, 8, 4);

		List<Integer> resultList = IntStream.range(0, inputList.size())
		        .filter(i -> inputList.get(i) > i)
		        .mapToObj(inputList::get)
		        .collect(Collectors.toList());

		System.out.println(resultList); 

		
	}

}
