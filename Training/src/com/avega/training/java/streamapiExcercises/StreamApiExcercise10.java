package com.avega.training.java.streamapiExcercises;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//10. Given a list of integers, return the sum of all the numbers that are greater than 10.
public class StreamApiExcercise10 {

	public static void main(String[] args) {
		 List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50,5);
		    
		 Integer sum = numbers.stream()
				 .filter(i-> i>10)
				 .mapToInt(Integer::valueOf)
				  .sum();
               System.out.println(sum);
               
		    
		      
		      
	}

}
