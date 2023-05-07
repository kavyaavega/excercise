package com.avega.training.java.localdate.excercises;
//5. Write a Java program to get the date of the first day of the current year using LocalDate.
import java.time.LocalDate;

public class FirstDayOfYear {

	public static void main(String[] args) {
		LocalDate currentDate = LocalDate.now();
		LocalDate firstDayOfYear = LocalDate.of(currentDate.getYear(), 1, 1);
		System.out.println(firstDayOfYear);
	}

}
