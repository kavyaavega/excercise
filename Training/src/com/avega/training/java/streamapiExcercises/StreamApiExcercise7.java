package com.avega.training.java.streamapiExcercises;

import java.util.Arrays;
import java.util.List;

//7. Given a list of strings, return a new list that contains the first letter of each string.
public class StreamApiExcercise7 {
	
	public static void main(String[] args) {
		List<String> strings = Arrays.asList("Kavya", "Linga", "Gokul", "Arun", "Naveen"); 
		strings.stream() 
		      // .map(s -> s.substring(0, 1)) 
		       .map(s-> s.charAt(0))
		       .forEach(s -> System.out.println(s)); 
		
	}

}
