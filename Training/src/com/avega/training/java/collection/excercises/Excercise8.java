package com.avega.training.java.collection.excercises;

import java.util.ArrayList;
import java.util.List;

//8.Implement a Java program to find the second largest element in a list of integers.
public class Excercise8 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(5);
        list.add(20);
        list.add(15);
        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int num : list) {
            if (num > firstMax) {
                secondMax = firstMax;
                firstMax = num;
            } else if (num > secondMax && num != firstMax) {
                secondMax = num;
            }
        }
        System.out.println("Second largest element in the list: " + secondMax);


	}

}
