package com.avega.training.java.streamapiExcercises;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//8. Given a list of integers, return a new list that contains only the numbers that are divisible by 3 and 5.
public class StreamApiExcercise8 {

	public static void main(String[] args) {
List<Integer> list = Arrays.asList(10,13,5,15,12,20);
        
List<Integer> number = list.stream() 
        .filter(i -> i%3 == 0 || i%5 == 0 )
        .collect(Collectors.toList());
        System.out.println(number);
	}

}
