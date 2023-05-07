package com.avega.training.java.excersise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HighestAndLowest {
	public static void main(String[] args) {
        String numbersString = "4 2 7 1 9 5 3";
        String[] numbersArray = numbersString.split(" ");
        List<Integer> numbersList = new ArrayList<>();

        for (String number : numbersArray) {
            int num = Integer.parseInt(number);
            numbersList.add(num);
        }

        int highest = Collections.max(numbersList);
        int lowest = Collections.min(numbersList);

        System.out.println(highest + " " + lowest);
       
	}

}
