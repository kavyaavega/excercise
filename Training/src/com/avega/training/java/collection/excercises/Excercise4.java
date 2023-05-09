package com.avega.training.java.collection.excercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//4.Implement a Java program to find the sum of all elements in a list of doubles.
public class Excercise4 {

	public static void main(String[] args) {
		List<Double> list = new ArrayList<>(Arrays.asList(1.0, 2.5, 3.75, 4.2, 5.8));
        double sum = sumOfDoubles(list);
        System.out.println(sum);
    }

    public static double sumOfDoubles(List<Double> list) {
        double sum = 0.0;
        for (double d : list) {
            sum += d;
        }
        return sum;
	}

}
