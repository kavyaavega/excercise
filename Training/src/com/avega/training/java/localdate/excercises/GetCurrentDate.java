package com.avega.training.java.localdate.excercises;
//1. Write a Java program to get the current date using LocalDate and print it.
import java.time.LocalDate;

public class GetCurrentDate {

	public static void main(String[] args) {
		LocalDate currentDate = LocalDate.now();
		System.out.println("currentDate:" + currentDate);
		

	}

}
