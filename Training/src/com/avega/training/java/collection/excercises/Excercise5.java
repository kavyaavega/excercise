package com.avega.training.java.collection.excercises;
//5.Write a Java program to find the index of a specific element in a list of strings.
import java.util.ArrayList;

public class Excercise5 {

	public static void main(String[] args) {
		 ArrayList<String> arrlist = new ArrayList<String>(5);
	      arrlist.add("Jhon");
	      arrlist.add("Manoj");
	      arrlist.add("Meghana");
	      arrlist.add("Bob");
	      int indval=arrlist.indexOf("Manoj");
	      System.out.println(indval);

	}

}
