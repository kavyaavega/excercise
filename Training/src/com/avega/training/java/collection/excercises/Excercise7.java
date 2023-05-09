package com.avega.training.java.collection.excercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//7.Write a Java program to merge two sorted lists of integers into a single sorted list.
public class Excercise7 {

	public static void main(String[] args) {
	    List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 9));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(2, 4, 6, 8, 10));
        List<Integer> mergedList = mergeSortedLists(list1, list2);
        System.out.println("The merged sorted list is: " + mergedList);
    }

    public static List<Integer> mergeSortedLists(List<Integer> list1, List<Integer> list2) {
        List<Integer> mergedList = new ArrayList<>();
        int i = 0, j = 0;
        while (i < list1.size() && j < list2.size()) {
            if (list1.get(i) <= list2.get(j)) {
                mergedList.add(list1.get(i));
                i++;
            } else {
                mergedList.add(list2.get(j));
                j++;
            }
        }
        if (i < list1.size()) {
            mergedList.addAll(list1.subList(i, list1.size()));
        }
        if (j < list2.size()) {
            mergedList.addAll(list2.subList(j, list2.size()));
        }
        return mergedList;
	}

}
