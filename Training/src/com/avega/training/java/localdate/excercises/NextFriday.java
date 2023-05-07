package com.avega.training.java.localdate.excercises;
//4. Write a Java program to get the next Friday after a given LocalDate object.
import java.time.DayOfWeek;
import java.time.LocalDate;

public class NextFriday {

	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2023, 05, 05);
		LocalDate nextFriday = date.with(DayOfWeek.FRIDAY).plusDays(7);
		System.out.println(nextFriday);

	}

}
