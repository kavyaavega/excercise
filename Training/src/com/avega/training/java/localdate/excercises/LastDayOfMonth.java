package com.avega.training.java.localdate.excercises;
//6. Write a Java program to get the date of the last day of the current month using LocalDate.
import java.time.LocalDate;

public class LastDayOfMonth {

	public static void main(String[] args) {
		LocalDate currentDate = LocalDate.now();
		LocalDate lastDayOfMonth = LocalDate.of(currentDate.getYear(), currentDate.getMonth(), currentDate.lengthOfMonth());
		System.out.println(lastDayOfMonth);

	}

}
