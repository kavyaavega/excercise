package com.avega.training.java.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
//12. Given a list of integers, return a new list that contains the difference between each adjacent pair of numbers.
public class StreamApiExample12 {

	public static void main(String[] args) {
		List<Integer> inputList = Arrays.asList(5, 2, 7, 1, 8, 4);

		List<Integer> resultList = IntStream.range(0, inputList.size() - 1)
		        .map(i -> inputList.get(i + 1) - inputList.get(i))
		        .boxed()
		        .collect(Collectors.toList());

		System.out.println(resultList);


	}

}
