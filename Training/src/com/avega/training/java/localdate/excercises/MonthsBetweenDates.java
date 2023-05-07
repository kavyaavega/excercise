package com.avega.training.java.localdate.excercises;
//9. Write a Java program to find the difference in months between two given LocalDate objects.
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class MonthsBetweenDates {

	public static void main(String[] args) {
		LocalDate date1 = LocalDate.of(2023, 5, 7);
		LocalDate date2 = LocalDate.of(2024, 2, 14);
		
		//long monthsBetween = ChronoUnit.MONTHS.between(date1.withDayOfMonth(1), date2.withDayOfMonth(2));
		Period period = Period.between(date1.withDayOfMonth(1), date2.withDayOfMonth(1));
		int monthsDifference = period.getYears() * 12 + period.getMonths();
		System.out.println(monthsDifference);
		//System.out.println(monthsBetween);

	}

}
