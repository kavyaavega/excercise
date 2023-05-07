package com.avega.training.java.localdate.excercises;
//7. Write a Java program to check whether a given LocalDate object falls on a weekend or not.
import java.time.DayOfWeek;
import java.time.LocalDate;

public class WeekendCheck {

	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2023, 5, 8);
		DayOfWeek dayOfWeek = date.getDayOfWeek();
		boolean isWeekend = dayOfWeek==dayOfWeek.SATURDAY || dayOfWeek==dayOfWeek.SUNDAY;
		System.out.println(isWeekend);
		

	}

}
