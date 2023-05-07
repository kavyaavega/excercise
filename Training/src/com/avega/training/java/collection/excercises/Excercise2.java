package com.avega.training.java.collection.excercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//2.Implement a Java program to sort a list of strings in ascending order.
public class Excercise2 {

	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("kavya");
        list.add("linga");
        list.add("gokul");
        list.add("naveen");
		Collections.sort(list);  
        System.out.println(list);

	}

}
