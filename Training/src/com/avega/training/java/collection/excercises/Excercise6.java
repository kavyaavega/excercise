package com.avega.training.java.collection.excercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//6.Implement a Java program to reverse the order of elements in a list of integers.
public class Excercise6 {

	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("kavya");
        list.add("linga");
        list.add("gokul");
        list.add("naveen");
		Collections.reverse(list); 
        System.out.println(list);

	}

}
