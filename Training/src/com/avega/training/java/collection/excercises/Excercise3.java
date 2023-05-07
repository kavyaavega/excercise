package com.avega.training.java.collection.excercises;
//3.Write a Java function to remove duplicate elements from a list of integers.
import java.util.HashSet;
import java.util.Set;

public class Excercise3 {

	public static void main(String[] args) {
		 Set<String> data = new HashSet<String>();
		    data.add("Java");   
	        data.add("Sql");   
	        data.add("react");   
	        data.add("Java"); 
	        System.out.println(data);

	}

}
