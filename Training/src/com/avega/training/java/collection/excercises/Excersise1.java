package com.avega.training.java.collection.excercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//1.Write a Java program to find the maximum element in a list of integers.
public class Excersise1 {

	public static void main(String[] args) {
		
		List<Integer> list=new ArrayList<>();
		list.add(44);
        list.add(11);
        list.add(22);
        list.add(33);
		int highest = Collections.max(list);
        System.out.println(highest);
		
	}

}
