package com.avega.training.java.localdate.excercises;
//3. Write a Java program to get the number of days between two LocalDate objects.
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class DaysBetweenDates {

	public static void main(String[] args) {
		LocalDate date1 = LocalDate.of(2023, 06, 07);
		LocalDate date2 = LocalDate.of(2023, 05, 17);
		
		long daysBetween = ChronoUnit.DAYS.between(date1, date2);
		//Period daysBetween = Period.between(date1, date2);
		
		//System.out.println("days between"+date1+"and"+date2+":"+ daysBetween);
		System.out.println(daysBetween);
	}

}
