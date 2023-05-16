package com.avega.training.java.streamapiExcercises;

import java.util.Arrays;
import java.util.List;

//9. Given a list of strings, return a new list that contains the length of each string.
public class StreamApiExcercise9 {

	public static void main(String[] args) {
		List<String> strings = Arrays.asList("Kavya", "Lingaraja", "Gokul", "Arun kumar", "Naveen"); 
		strings.stream()  
		        .map(s -> s.length())
		       .forEach(s -> System.out.println(s)); 
		

	}

}
