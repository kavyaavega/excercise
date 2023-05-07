package com.avega.training.java.localdate.excercises;
//8. Write a Java program to check whether a given LocalDate object is before or after another given
//LocalDate object.
import java.time.LocalDate;

public class DateComparison {

	public static void main(String[] args) {
		LocalDate date1 = LocalDate.of(2023, 06, 07);
		LocalDate date2 = LocalDate.of(2023, 05, 17);
		if(date1.isBefore(date2)) {
			System.out.println(date1 + "is before"+ date2);
		}
		else
			System.out.println(date1 + "is after"+ date2);
			

	}

}
