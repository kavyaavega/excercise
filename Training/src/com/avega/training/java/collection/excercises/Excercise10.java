package com.avega.training.java.collection.excercises;
//10. Implement a Java program to remove all elements from a list that are divisible by a specific number.
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Excercise10 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        int divisor = 2;
        removeDivisible(list, divisor);
        System.out.println("The list with all elements divisible by " + divisor + " removed is: " + list);
    }

    public static void removeDivisible(List<Integer> list, int divisor) {
        list.removeIf(n -> n % divisor == 0);

	}

}
