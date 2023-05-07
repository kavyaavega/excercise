package com.avega.training.java.localdate.excercises;
//2. Write a Java program to get the year, month, and day of the current date using LocalDate.
import java.time.LocalDate;

public class GetYearMonthDate {

	public static void main(String[] args) {
		LocalDate currentDate = LocalDate.now();
		int year = currentDate.getYear();
		int month = currentDate.getMonthValue();
		int day = currentDate.getDayOfMonth();
		System.out.println("Year:"+ year);
		System.out.println("Month:"+ month);
		System.out.println("Day:"+ day);

	}

}
