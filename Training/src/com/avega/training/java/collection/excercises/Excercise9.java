package com.avega.training.java.collection.excercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//9. Write a Java function to find the intersection of two lists of integers.
public class Excercise9 {

	public static void main(String[] args) {
		 List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
	        List<Integer> list2 = new ArrayList<>(Arrays.asList(3, 4, 5, 6, 7));
	        List<Integer> intersection = findIntersection(list1, list2);
	        System.out.println("The intersection of the two lists is: " + intersection);
	    }

	    public static List<Integer> findIntersection(List<Integer> list1, List<Integer> list2) {
	        Set<Integer> set1 = new HashSet<>(list1);
	        Set<Integer> set2 = new HashSet<>(list2);
	        set1.retainAll(set2);
	        return new ArrayList<>(set1);

	}

}
